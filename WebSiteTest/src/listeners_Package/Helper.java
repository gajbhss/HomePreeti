package listeners_Package;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Helper extends TestListenerAdapter 
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Passed Test case Name is : "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Failed Test case Name is : "+result.getName());
	}
	
	

	
}
