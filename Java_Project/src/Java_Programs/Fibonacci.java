package Java_Programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args)
	{
		
		int no=10;
		
		int no1=0, no2=1, no3;
		
		System.out.print(no1+ " "+ no2);
		
		for(int i=2;i<=no;i++)
		{
			no3=no1+no2;
			
			System.out.print(no3);
			
			no1=no2;
			no2=no3;
		}
		
		
		
	}

}
