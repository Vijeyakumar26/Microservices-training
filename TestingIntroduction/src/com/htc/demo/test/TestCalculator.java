package com.htc.demo.test;



import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.junit.Test;

import com.htc.demo.app.Calculator;


public class TestCalculator {
	//class need to tested should be associated here
	Calculator calculator =new Calculator();

	@Test
	public void testDivison_two_postiveInteger_ShouldReturnNumericalValue()
	{
		double actualResult=calculator.doDivision(10,5);
		//Assertion and verfiy
		assertEquals(2, actualResult,0);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivison_denominatorAsZero_ShouldThrowException()
	{
		double actualResult=calculator.doDivision(10,0);
		//Assertion and verfiy
		assertEquals(2, actualResult,0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivison_bothParameterAszero_ShouldThrowException()
	{
		
		double actualResult=calculator.doDivision(10,0);
		//Assertion and verfiy
		assertEquals(0, actualResult,0);
	}
}
