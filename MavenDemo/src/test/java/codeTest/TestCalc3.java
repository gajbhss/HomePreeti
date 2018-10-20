package codeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc3 {
	
	@Test
	public void add()
	{
		System.out.println("Sum");
		int a=10,b=20;
		Assert.assertEquals(a+b, 30);
	}
	@Test
	public void sub()
	{
		System.out.println("Subtraction");
		int a=10,b=20;
		Assert.assertEquals(b-a, 10);
	}
	@Test
	public void mul()
	{
		System.out.println("multipli");
		int a=10,b=20;
		Assert.assertEquals(a*b, 200);
	}
	@Test
	public void div()
	{
		System.out.println("div");
		int a=10,b=20;
		Assert.assertEquals(b/a, 2);
	}
	

}
