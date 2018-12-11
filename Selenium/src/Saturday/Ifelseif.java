package Saturday;

public class Ifelseif {

	public static void main(String[] args) {
		
		String str="Chrome";
		
		if(str.equalsIgnoreCase("chrome"))
		{
			System.out.println("TC executed on Chrome browser");
		}
		
		else if(str.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC exectued on Firefox browser");
		}
		else if(str.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE browser");
		}
		
		else
		{
			System.out.println("Plase provoid valid browser");
		}
		
		

	}

}
