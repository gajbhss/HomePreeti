package oops_concept;

class Advanto
{
	public void address()
	{
		System.out.println("1. Chinchwad   2. Karve_Nagar    3.Kharadi ");
	}
}

class Advanto_Chinchwad extends Advanto
{
	public void address()
	{
		System.out.println("Behind Big Bajar, Chinchwad ");
	}
		
}

class Advanto_Karve_Nagar extends Advanto
{
	public void address()
	{
		System.out.println("Karve Nagar , Pune ");
	}
		
}





public class Method_Overriding {

	public static void main(String[] args)
	{
		//Advanto a;
		//a=new Advanto();
		//a.address();
		Advanto a=new Advanto();
		a.address();
		
		
		a=new Advanto_Chinchwad();
		a.address();
		
		a=new Advanto_Karve_Nagar();
		a.address();
		

	}

}
