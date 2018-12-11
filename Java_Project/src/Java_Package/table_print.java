package Java_Package;

import java.util.Scanner;

public class table_print {

	public static void main(String[] args) 
	{
		int i;
		
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=Sc.nextInt();
		
		
		
		//System.out.println("Take number from user a print table of it:");
		System.out.println("Table is of :"+num);
		
		for(i=1;i<=10;i++)
		{
			 //ans=num*i;
			 System.out.println(num+" * "+i+" = "+(num*i));
			
		
		}
		Sc.close();
	}

}
