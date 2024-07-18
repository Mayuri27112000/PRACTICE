package Excep;
import java.util.*;

class UnderAgeExcep extends Exception
{
	public String getMessage()
	{
		return "Not applicable if age<18";
	}
}
class OverAgeExcep extends Exception
{
	public String getMessage()
	{
		return "Not applicable if age>60";
	}
}
class Demo
{
	int age;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	void dispatch()
	{
	try{
		if(age<=18)
		{
		throw new UnderAgeExcep();
		}
		else if(age>=60)
		{
		throw new OverAgeExcep();
		}
		else
		{
		System.out.println("Collect your DL");
		}
	
	}
	catch(UnderAgeExcep e)
	{
	System.out.println(e.getMessage());
	}
	catch(OverAgeExcep e)
	{
	System.out.println(e.getMessage());
	}
	}
}
public class DispatchDL
{
   public static void main(String[]args)
   {
	 Demo d1=new Demo();
	 d1.input();
	 d1.dispatch();
   
   }   
}  


