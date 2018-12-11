package Saturday;

public class objectClass1 {

	int a=10;
	int b=20;
	
	public static void main(String[] args)
	{
		//for calling non-static method
		objectClass1 obj1=new objectClass1();
		obj1.add();
		
		//for calling static method
		objectClass1.sub();
		

	}
	//for non-static method
	public void add()
	{
		System.out.println("Addition");
	}
	
	//for static method
	public static void sub()
	{
		System.out.println("Subtraction");
	}

}
