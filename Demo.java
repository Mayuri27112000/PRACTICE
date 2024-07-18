package threading;
import java.util.*;

//single threading program

public class Demo 
{
    void banking() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Username");
	String un=sc.next();
	System.out.println("Enter PW");
	int pw=sc.nextInt();
	System.out.println("Collect ur cash");
	}
    
    void print() {
	try 
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Mayu");
			Thread.sleep(2000);
		}
	}
	catch(Exception e) 
	{
			System.out.println(e.getMessage());
	}
    }
	void add() {
		int a,b,c;
		a=20;
		b=10;
		c=a+b;
		System.out.println(c);
	}
    public static void main(String[]args) {
	   Demo d1=new Demo();
	   d1.banking();
	   d1.print();
	   d1.add();

   }
}
