package oops_concept;


class sal
{
	private int salary=30000;
	
	//public method 1
	private void show()
	{
		System.out.println("Salary is : "+salary);
	}
	
	public void demo()
	{
		show();
	}
	
}

public class Encapsulation_Abtraction {

	public static void main(String[] args)
	{
		sal s=new sal();
		s.demo();

	}

}
