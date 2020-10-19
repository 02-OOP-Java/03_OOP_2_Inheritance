package com.cc.java;

public class Cat 
{
	// Fields
	private String name;
	private String furColor;
	private int age;
	
	private int level;
	
	/**
	 * @param name
	 * @param furColor
	 * @param ages
	 */
	public Cat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}

	public String tellYourAttributes(String flag) {
		switch (flag) 
		{	
			case "#name":
				return "Name: " + this.name;
			case "#color":
				return "Fellfarbe: " + this.furColor;
			default:
				return "Something went wrong!";
		}	
	}
	
	public String tellYourAge() {
		return this.checkEscalationLevel();
	}
	
	private String checkEscalationLevel() {
		
		// 1. --> "This is an inappropriate question!"
		// 2. --> "I've told you once!"
		// 3. --> "Talk to the hand!"
		
		this.level++;
		
		switch (this.level) {
		case 1:
			return "This is an inappropriate question!";		
		case 2:
			return "I've told you once!";		
		case 3:
			return "Talk to the hand!";
		default:
			return "shutdown!";
		}		
	}
	
}
