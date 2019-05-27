package com.valtz.springcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// load configuration from xml
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getMyDailyWorkout());
		
		// fortuneService has been injected within configuration
		// and we can just use it in the runtime
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
