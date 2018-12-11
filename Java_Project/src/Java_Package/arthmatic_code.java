package Java_Package;

import java.util.Scanner;

public class arthmatic_code {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First No:  ");
		int a=sc.nextInt();
		System.out.println("Enter Second No:  ");
		int b=sc.nextInt();
		System.out.println("Addtion of two no is : "+(a+b) );
		System.out.println("Subtraction of two no is: "+(a-b));
		System.out.println("Multiplication of two no is: "+(a*b));
		System.out.println("Division of two no is: "+(a/b));
		sc.close();
	}

}
