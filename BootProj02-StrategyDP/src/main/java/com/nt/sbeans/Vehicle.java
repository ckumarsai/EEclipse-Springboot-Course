package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	//Has-A property
	@Autowired
	@Qualifier("eEngg")
	private Engine engine;
	public void Vehicle() {
		System.out.println("Vehicle: 0-param constructor");
	}
	public void move(String Sourceplace,String Destplace) {
		engine.start();
		System.out.println("Journey Started from :" +Sourceplace);
		System.out.println("Journey going on");
		engine.stop();
		System.out.println("Journey stopped at:" +Destplace);
	}

}
