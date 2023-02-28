package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
public class LivingThingsTests {
  final static String  Human_movement="walk";
  final static String  BIRDS_MOVEMENT="Fly";
   

@Autowired
LivingThings livingthings;

@Autowired
@Qualifier("snacks1")
LivingThings livingthings1;

@Autowired
@Qualifier("snacks3")
LivingThings livingthings2;

	 
@Test
	void testLivingThingmovement() {
	
	System.out.println("livingthings");
	String acutalmovement=livingthings.movement();
	
	assertThat(acutalmovement.equals(Human_movement));
	
      // assertEquals(Human_movement,acutalmovement);
       livingthings =new Birds();
       acutalmovement=livingthings.movement();

       System.out.println("the instance is"+livingthings);
	
       //assertThat(BIRDS_MOVEMENT,acutalmovement);
       
       System.out.println("the livingthings1 is"+livingthings2+"and its movement+livingthing2.movement()");
   	
		
	}


}













	

	
   
	
		
	









	

