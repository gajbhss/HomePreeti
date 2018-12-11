package Java_Package;

import java.util.Scanner;

public class run_declaration {

	public static void main(String[] args)
	{
		
		int a;
		String b;
		double c;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of a:  ");
		a=sc.nextInt();
		
		
		System.out.print("Enter the string: ");
		b=sc.next();
		
		System.out.print("Enter the float value:  ");
		c=sc.nextDouble();
		
		System.out.println("Entered value is: "+a);
		System.out.println("Entered String 1 is: "+b);
		System.out.println("Entered Dobuble value is:  "+c);
		sc.close();
	}
	

}
