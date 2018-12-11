package Saturday;

public class ParentClass extends ChildClass{

	public static void main(String[] args) {
		

		ParentClass obj=new ParentClass();
		
		obj.mul();
		obj.div();
		
	}
	
	public void add()
	{
		System.out.println("This is parent class and addition is: ");
	}
	public void sub()
	{
		System.out.println("This is parent class and subtraction is: ");
	}

}
