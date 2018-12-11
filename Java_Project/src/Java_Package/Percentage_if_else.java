package Java_Package;

import java.util.Scanner;

public class Percentage_if_else {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no :");
		int num=sc.nextInt();
		
		if(num>=75 && num<=100 )
		{
			System.out.println("A Grade :");
		}
		else
		{
			if(num>=60 && num<=74)
			{
				System.out.println("B Grade :");
			}
			else
			{
				if(num>=45 && num<=59)
				{
					System.out.println("C Grade");
				}
				else
				{
					if(num>=35  && num<=44)
					{
						System.out.println("D Grade :");
					}
					else
					{
						if(num>=0 && num<=34)
						{
							System.out.println("Fail :");
						}
					}
				}
			}
		}
		
		sc.close();
	}

}
