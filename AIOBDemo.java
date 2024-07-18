package Excep;
import java.util.*;

public class AIOBDemo 
{
	public static void main(String[]args)
	{
	    System.out.println("Entering to main method");
	    int a[]=new int[5];
	    Scanner sc=new Scanner(System.in);
	    int i;
	    for(i=0;i<=4;i++) {
	    	System.out.println("Enter the elements");
	    	a[i]=sc.nextInt();
	    }
	    try {
	    	 for(i=0;i<=5;i++) 
	    		 System.out.println(a[i]);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Prblm in Array");
	    }
	    System.out.println("Exit Normally");
	}
}
