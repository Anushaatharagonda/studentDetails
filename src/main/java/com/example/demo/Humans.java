package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Humans implements LivingThings {

	@Override
	public String movement() {
		// TODO Auto-generated method stub
		return "run";
	}


}
