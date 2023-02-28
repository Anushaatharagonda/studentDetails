package com.example.demo;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class snackeconfig {
@Bean(name="snacks1")
	public snacks getsnacke1() {
		return new snacks(1);
	}
@Bean(name="snacks2")
public snacks getsnacke2() {
	return new snacks(1);
		
	}
@Bean(name="snacks3")
public snacks getsnacke3() {
	return new snacks(365);
}
}

