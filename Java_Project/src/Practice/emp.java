package Practice;
interface demo
{
	void add();
	void sub();
	
	static void mul()
	{
		
	}

}





class parent 
{
	void add()
	{
		this.add();
	}
	
	static void sub()
	{
		
	}
	
}
public class emp extends parent    
{	
	static void mul()
	{
		
	}
	public static void main(String args[])
	{
	
		sub();
		
	}
	
	
}