package Java_Package;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no : ");
		int a=sc.nextInt();
		
		System.out.println("Enter the Second no : ");			
		int b=sc.nextInt();
		
		System.out.println("Enter the Third no : ");			
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("First no is Greter:  "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Second no is Greter: "+b);
		}
		
		else if(c>b && c>a)
		{
			System.out.println("Third no is Greter: "+c);
		}
		
		else 
		{
			System.out.println("Three values  are same");
		}		
		sc.close();
		                    
		
		
	}

}
