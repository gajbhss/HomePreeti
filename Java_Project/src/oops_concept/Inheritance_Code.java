package oops_concept;

//Parent class
class salary
{
	int sal,bonus;
	
	public void show_sal()
	{
		System.out.println("Salary is :"+sal);
		System.out.println("Bonus is : "+bonus);
		System.out.println("Total salary"+(sal+bonus));
	}
}

//child class 1
class IT extends salary
{
	
}

//child class 2
class Sales extends salary
{

}


public class Inheritance_Code {

	public static void main(String[] args) 
	{
		System.out.println("IT Department salary : ");
		IT obj=new IT();
		obj.sal=30000;
		obj.bonus=2000;
		obj.show_sal();
		
		System.out.println();
		System.out.println("Sales Department salary : ");

		Sales obj2=new Sales();
		obj2.sal=10000;
		obj2.bonus=1300;
		obj2.show_sal();
		
		

	}

}
