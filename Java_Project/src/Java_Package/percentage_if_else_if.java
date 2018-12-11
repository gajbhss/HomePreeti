package Java_Package;

import java.util.Scanner;

public class percentage_if_else_if {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		int per=sc.nextInt();
		
		if(per>=100 && per<=75)
			System.out.println(" A Grade ");
		else if(per>=60 && per<=74)
			System.out.println("B Grade ");
		else if(per>=50 && per<=59)		
			System.out.println(" C Grade");
		else if(per>=35 && per<=49)		
			System.out.println(" C Grade");
		else if(per>=0 && per<=34)		
			System.out.println(" Fail");
		sc.close();
		
		
		
		

	}

}
