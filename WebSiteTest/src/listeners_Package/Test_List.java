package listeners_Package;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listeners_Package.Helper.class)
public class Test_List 
{

	@Test
	public void login_to_Gmail()
	{
		System.out.println("Login to gmail");
	}
	
	@Test
	public void login_to_facebook()
	{
		System.out.println("Login to facebook");
	}
	
	@Test
	public void method1_for_failed()
	{
		Assert.assertEquals("actual", "expected");	
	}
}
