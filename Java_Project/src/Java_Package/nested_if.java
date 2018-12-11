package Java_Package;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter percentage :");
		int per=sc.nextInt();
		
		if(per>=75)
		{
			if(per<=100)
				System.out.println("A Grade ");
		}
		
		if(per>=60)
		{
			if(per<=74)
				System.out.println(" B Grade");
		}
		
		if(per>=50)
		{
			if(per<=59)
				System.out.println(" C Grade");
		}
		
		if(per>=35)
		{
			if(per<=49)
				System.out.println(" D Grade");
		}
		
		if(per>=0)
		{
			if(per<=34)
				System.out.println(" Fail");
		}
		sc.close();
	}
	
}
