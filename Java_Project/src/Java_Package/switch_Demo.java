package Java_Package;

import java.util.Scanner;

public class switch_Demo {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Grade Available");
		System.out.println("Distriction");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		
		
		System.out.print("Enter the grade: ");
		String str=sc.next();
		
		switch(str)
		{
		case "Distriction":
			System.out.println("Percentage range is 75- 100");
			break;
			
		case "A":
			System.out.println("Percentage range is 60-74");
			break;
		case "B":
			System.out.println("Percentage range is 45-59");
			break;
		case "C":
			System.out.println("Percentage range is 35-44");
			break;
		case "D":
			System.out.println("Percentage range is 0-34");
			break;
			
		default:
			System.out.println("Invalid Grade");
			
		}
	sc.close();
	}

}
