package webtest;
class Test1 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(200);	} catch (InterruptedException e) {e.printStackTrace();}
		}		
	}	
}
class Test2 implements Runnable
{
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(200);	} catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
}
public class ThreadUsingInterface {
	

	public static void main(String[] args) {
		Test1 obj=new Test1();
		Test2 obj1=new Test2();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();

	}

}
