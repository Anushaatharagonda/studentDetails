package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car {
	@Autowired
private enginee enginee;
	@Autowired
private fuel fuel;
	public  void start() {
		enginee.start();
		fuel.start();
	System.out.println("car start");
	}
	


}
