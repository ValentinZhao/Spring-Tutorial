package com.valtz.springcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load context from config
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from context
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		// call methods on bean
		
		System.out.println(coach.getMyDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getTeam());
		
		// close the context
		context.close();
	}

}
