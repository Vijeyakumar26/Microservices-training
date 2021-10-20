package com.htc.demo.app;

public class Calculator {
	
	public double doDivision(double numerator,double denominator)
	{
		double result = 0;
		if(denominator!=0)
		{
			result=numerator/denominator;
		}
		else
		{
			throw new ArithmeticException("Denominator should not zero"); 
		}
		
		return result;
	}
}
