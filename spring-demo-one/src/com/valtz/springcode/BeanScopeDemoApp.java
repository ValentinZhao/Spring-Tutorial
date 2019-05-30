package com.valtz.springcode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load context from config
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from context
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		Coach betaCoach = context.getBean("myCoach", Coach.class);
		
		boolean isIdentical = alphaCoach == betaCoach;
		
		System.out.println("is two bean sharing the same memory: " + isIdentical);
		
		System.out.println("The memory location of alpha: " + alphaCoach);
		
		System.out.println("The memory location of beta: " + betaCoach);
		
		// close the context
		context.close();
	}

}
