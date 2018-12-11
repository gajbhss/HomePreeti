package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG_Inheritance extends TestNG_Inheritance_Child_Class {
 
	 @BeforeTest
	  public void beforeTest() 
	 {
		 System.out.println("Program Started....");
	  }
	
	@Test
  public void addition() 
	{
		TestNG_Inheritance_Child_Class.add();
		
		
  }
 
	@Test
	public void subtraction()
	{
		TestNG_Inheritance_Child_Class.sub();
	}
	
	
	@Test
	public void Multiplication()
	{
		TestNG_Inheritance_Child_Class.mul();
	}

  @AfterTest
  public void afterTest()
  {
	  System.out.println("Program finished...Passed...");
  }

}
