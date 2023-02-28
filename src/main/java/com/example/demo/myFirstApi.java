package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myFirstApi {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@GetMapping("/reverse")
	public String rev() {
		String a="anusha";
		String b=" ";
		int len=a.length();
		for(int i=len-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			System.out.println(b);
		}
		return b;
	}

}
