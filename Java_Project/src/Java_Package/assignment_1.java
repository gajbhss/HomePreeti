package Java_Package;

import java.util.Scanner;

public class assignment_1 {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First No:");
		int a=s.nextInt();

		System.out.println("Enter Second No:");
		int b=s.nextInt();

		System.out.println("Operations to be Performed :");
		String str=s.next();
		
		if(str.equalsIgnoreCase("Add"))
			System.out.println("Addition is: "+(a+b));
		
		if(str.equalsIgnoreCase("Sub"))
			System.out.println("Subtraction is :"+(a-b));
		
		if(str.equalsIgnoreCase("Mul"))
			System.out.println("Multiplication is :"+(a*b));

		if(str.equalsIgnoreCase("Div"))
			System.out.println("Division is :"+(a/b));
		s.close();
		
	}
	
}
