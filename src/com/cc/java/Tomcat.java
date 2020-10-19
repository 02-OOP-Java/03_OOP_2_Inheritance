package com.cc.java;

public class Tomcat 
{
	// Fields
	private String name;
	private String furColor;
	private int age;
	
	/**
	 * @param name
	 * @param furColor
	 * @param age
	 */
	public Tomcat(String name, String furColor, int age) {
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
		return "Alter: " + this.age;
	}
		
}
