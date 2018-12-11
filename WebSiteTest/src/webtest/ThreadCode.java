package webtest;
class A extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++)
		{
		System.out.println("Hi");
		try {Thread.sleep(200);	} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(200);	} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class ThreadCode {

	public static void main(String[] args) throws InterruptedException 
	{
		A obj=new A();
		B obj1=new B();
		
		obj.start();	
		obj1.start();
		

		
	}

}
