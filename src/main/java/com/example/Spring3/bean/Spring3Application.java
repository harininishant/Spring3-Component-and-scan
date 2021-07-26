package com.example.Spring3.bean;

import com.example.Spring3.bean.AppConfOne;
import com.example.Spring3.bean.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Spring3Application {

	public static void main(String[] args) {
		ApplicationContext C= new AnnotationConfigApplicationContext(AppConfOne.class);
		System.out.println(C.getBean("game", Game.class).playGame());
		//((ConfigurableApplicationContext) C).registerShutdownHook();// to shut the config we use this
		// to call predestroy anotation
	}

}
