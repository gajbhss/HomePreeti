package oops_concept;

class addition
{
	//for two no.
	public static void add(int a,int b)
	{
		System.out.println("Addtion is : "+(a+b));
	}
	
	//for three no.
	public static void add(int a,int b, int c)
	{
		System.out.println("Addtion is : "+(a+b+c));
	}
	
	
	//for four no.
	public static void add(int a,int b, int c,int d)
	{
		System.out.println("Addtion is : "+(a+b+c+d));
	}
	
	public static void add(double a,double b)
	{
		System.out.println("Addtihyon is : "+(a+b));
	}
	
}




public class Method_Overloading {

	public static void main(String[] args)
	{
		addition.add(20, 56);
		addition.add(12, 78, 10, 89);
		addition.add(21.12, 15.06);
	}

}
