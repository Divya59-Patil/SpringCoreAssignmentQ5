package com.seleniumexpress.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans is loaded");
		Student stu1 = context.getBean("student",Student.class);
		stu1.displayStudentInfo();
	}

}
