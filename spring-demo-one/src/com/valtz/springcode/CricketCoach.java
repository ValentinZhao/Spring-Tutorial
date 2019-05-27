package com.valtz.springcode;

public class CricketCoach implements Coach {

	private FortuneService theFortune;
	
	public CricketCoach() {
		System.out.println("Called from no-arg constructor");
	}
	
	

	// VERY IMPORTANT!! You have to match the setter name with the
	// "name" attribute in property tag, i.e.,
	// here the setter name is "setTheFortune" which means the name attribute
	// in xml should be "theFortune"
	public void setTheFortune(FortuneService theFortune) {
		System.out.println("Called from inside the setter");
		this.theFortune = theFortune;
	}



	@Override
	public String getMyDailyWorkout() {
		return "Make yourself 30 mins bowling!";
	}

	@Override
	public String getDailyFortune() {
		return theFortune.getDailyFortune();
	}

}
