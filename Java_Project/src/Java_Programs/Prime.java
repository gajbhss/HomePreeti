package Java_Programs;

public class Prime {

	public static void main(String[] args)
	{
		int no=371,rem,arm=0;
		
		while(no!=0)
		{
			rem=no%10;
			
			arm=arm+rem*rem*rem;
			
			no=no/10;
		}
		
		if(arm==371)
		{
			System.out.println("Armstrong no"+arm);
		}
		
		else
		{
			System.out.println("Not Armstrong");
		}
			
		
		
	}
	
	
	
}
