package com.valtz.springcode;

public class BaseballCoach implements Coach{
	
	private FortuneService theFortune;
	
	
	// here is where dependency injected
	public BaseballCoach(FortuneService myFortune) {
		this.theFortune = myFortune;
	}

	@Override
	public String getMyDailyWorkout() {
		return "30 mins running";
	}

	@Override
	public String getDailyFortune() {
		
		// here the injected fortune service works
		return theFortune.getDailyFortune();
	}

}
