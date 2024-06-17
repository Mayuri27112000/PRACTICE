package practicesets;

import java.util.Random;
import java.util.Scanner;


public class Game 
{
    
	public static void main(String[] args) 
	{
	 // 0 for Rock 1 for Paper 2 for Scissor	
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Your Choice:");
	 int userchoice=sc.nextInt(3);
	 
	 Random random=new Random();
	 int compchoice=random.nextInt(3);
	 
	 if(userchoice==compchoice)
	 {
		 System.out.println("Draw");
	 }
	 else if(userchoice==0 && compchoice==2 ||userchoice==1 && compchoice==0 ||userchoice==2 && compchoice==1)
	 {
		 System.out.println("You Win");
	 }
	 else
	 {
		 System.out.println("Computer Win");
	 }
	 
	 System.out.println("Computer choosen:" +compchoice);
	   
		
	}

}
