package com.seleniumexpress.example;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	private String interestedCourse;

	private String hobby;
    
	public void setName(String name) {
		this.name = name;
		System.out.println("Set Name setter method");
	}

	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
		System.out.println("Set interestedCourse setter method");
	}

	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("Set Hobby setter method");
	}

	public void displayStudentInfo() {
		System.out.println("Student name is : " + name);
		System.out.println("Student interested cource is : " + interestedCourse);
		System.out.println("Student hobby is : " + hobby);
	}

}
