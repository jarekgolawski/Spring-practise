package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add and init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside mthod doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside mthod doMyStartupStuffYoYo");
	}
	

}
