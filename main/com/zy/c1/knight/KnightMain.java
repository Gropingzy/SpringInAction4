package com.zy.c1.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
