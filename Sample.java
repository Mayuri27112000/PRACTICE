/*Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42*/

package practicesets;
import java.util.*;
public class Sample 
{

	public static void main(String[] args) 
	{
       Scanner sc= new Scanner(System.in);
        
        int i=sc.nextInt();
        double db=sc.nextDouble();
        sc.nextLine();
        String str=sc.nextLine();
        
        
        System.out.println("String: " +str);
        System.out.println("Double: " + db);
        System.out.println("Int: " +i);
        
        

    }
		
	

}
