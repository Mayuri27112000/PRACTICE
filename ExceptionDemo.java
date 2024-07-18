package Excep;
import java.util.*;

public class ExceptionDemo 
{
   public static void main(String[]args)
   {
	   int a,b,c;
	   System.out.println("Entering to main method");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value of a");
	   a=sc.nextInt();
	   System.out.println("Enter the value of b");
	   b=sc.nextInt();  
	   try 
	   {
		   c=a/b;
		   System.out.println("RESULT IS"+c);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Prblm in Div");
	   }
	   System.out.println("Exit normally");
	   
   }
}
