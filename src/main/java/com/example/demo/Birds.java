package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("birdsobj")
public class Birds implements LivingThings {

	@Override
	public String movement() {
		// TODO Auto-generated method stub
		return "fly";
	}

}
