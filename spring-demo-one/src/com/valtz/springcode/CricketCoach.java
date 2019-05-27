package com.valtz.springcode;

public class CricketCoach implements Coach {

	private FortuneService theFortune;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("Called from no-arg constructor");
	}
	
	

	// setter method for injection
	// VERY IMPORTANT!! You have to match the setter name with the
	// "name" attribute in property tag, i.e.,
	// here the setter name is "setTheFortune" which means the name attribute
	// in xml should be "theFortune"
	public void setTheFortune(FortuneService theFortune) {
		System.out.println("Called from inside the setter - setTheFortune");
		this.theFortune = theFortune;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Called from inside the setter - emailAddress");
		this.emailAddress = emailAddress;
	}

	

	public void setTeam(String team) {
		System.out.println("Called from inside the setter - team");
		this.team = team;
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
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
