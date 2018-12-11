package Saturday;

public class IfDemo {

	public static void main(String[] args) {
		
		String name="Jesus";
		String name1="  God";
		String str1="abc";
		String str2="Abc";
		
		
		if(name.equalsIgnoreCase("Jesus"))
		{
			System.out.println("Good");
		}
		else 
		{
			System.out.println("Bad");
		}
		
		if(name1.equalsIgnoreCase("God is"))
		{
			System.out.println("Good");
		}

		String name2=name+name1;
		System.out.println("Total Name is:  "+name2);
		
		if(str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("Both string are equal");
			
		}
		else
		{
			System.out.println("Both stirng are different");
		}
	}

}
