package threading;
import java.util.*;

//multitasking program 

class Task1 extends Thread{
	Task1(){
		start();
	}
    public void run() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter UserName");
    	String un=sc.next();
    	System.out.println("Enter PW");
    	int pw=sc.nextInt();
    	System.out.println("collect ur cash");
    }
}
class Task2 extends Thread
{
	Task2(){
		start();
	}
    public void run() {
    	try
    	{
    		for(int i=1;i<=30;i++) {
    			System.out.println("MAYU");
    			Thread.sleep(2000);
    			
    		}
    	}
    		catch(Exception e) {
    			System.out.println(e.getMessage());
    		}
         
    }
                 
}
class Task3 extends Thread
{
	Task3(){
		start();
	}
    public void run() {
    	int a,b,c;
    	a=20;
    	b=30;
    	c=a+b;
    	System.out.println(c);
    		
    	}
    
}
public class Demo1 {
	public static void main(String[]args) {
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		Task3 t3=new Task3();
	}

}
