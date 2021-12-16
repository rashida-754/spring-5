package com.spring.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach baseBallCoach = new BaseBallCoach();
		
		//use the object	
		System.out.println(baseBallCoach.getDailyWorkOut());	
	}
}
