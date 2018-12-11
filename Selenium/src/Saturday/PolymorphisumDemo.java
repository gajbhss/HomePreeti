package Saturday;

public class PolymorphisumDemo {

	public static void main(String[] args) {
		
		

	}
	// NO of arguments
	public void add(int a, double b)
	{
		int c=(int) (a+b);
		System.out.println("Addtion is "+c);
	}
	
	public void add(int a, int b, int d)
	{
		int c=a+b;
		System.out.println("Addtion is "+c);
	}
	
	//Type of arguments
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println("Addtion is "+c);
	}
	
	//Order of arguments
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("Addtion is "+c);
	}
	
	//
	
	//
	
}
