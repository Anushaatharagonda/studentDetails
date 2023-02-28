package com.example.demo;

public class snacks implements LivingThings{

	private int snacketype;
	public snacks(int snacketype)
	{
		this.snacketype=snacketype;
	}
	@Override
	public String movement() {
		// TODO Auto-generated method stub
		switch(snacketype)
		{
		case 1:
		return"run nd walk";
		case 2:
			return"jump nd run";
			default:
			return "its not a snacke";
		
		}
	}
	

}
