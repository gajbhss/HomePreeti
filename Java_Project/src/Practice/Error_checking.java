package Practice;

public class Error_checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			div();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}
	
	 static public void div()
	{
		int a;
		a=10/0;
	}

}
