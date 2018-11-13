package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test
	public void sum()
	{
		System.out.println("ADD");
		int a=3;
		int b=5;
		Assert.assertEquals(8, a+b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("SUB");
		int a=5;
		int b=3;
		Assert.assertEquals(2, a-b);
	}
	
	@Test
	public void mul()
	{
		System.out.println("MUL");
		int a=3;
		int b=5;
		Assert.assertEquals(15, a*b);
	}
}
