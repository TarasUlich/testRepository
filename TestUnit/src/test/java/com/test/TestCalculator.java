package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;





import com.lesson.Calculator;

public class TestCalculator {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator = new Calculator();
	}
	@AfterClass
	public static void destroy(){
		calculator = null;
	}
	
	
	
	@Test
	public void testAdd(){
		int real = calculator.add(5, 5);
		int expected = 10;
		
		Assert.assertEquals("write when test fail" ,expected, real);
		
		
		
//		if(expected != real){
//			Assert.fail("ffffff");
//		}
	}
	
	@Test
	public void testSubstruct(){
		Assert.assertEquals(calculator.substruct(2, 2),0,0.000001);
	}
	
	
	@Before
	public void beforeEveryTest(){
		System.out.println("everry test");
	}
	
	
	
	
	
}


























