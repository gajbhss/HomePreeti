package oops_concept;

class Course
{
	static int course_Id=101;
	static String Course_Name="Selenium";
	static int fees=15000;
	static String duration="32 hours";
	
	
	


public static void show_detalis()
{
	System.out.println("Course id : "+course_Id);
	System.out.println("Course Name :"+Course_Name);
	System.out.println("Fees are : "+fees);
	System.out.println("Duration of course is: "+duration);
}






}

public class Class_Object {

	public static void main(String[] args)
	{
		
		Course.show_detalis();
	}

}
