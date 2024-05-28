import java.util.Scanner;

public class Discount{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your membership status:");
        String membershipStatus = scanner.nextLine();
        
        System.out.print("Enter your purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        
        double discount = 0;

        if (membershipStatus.equals("premium") && purchaseAmount > 1000) 
        {
            discount = 0.20 * purchaseAmount;
        } else if (membershipStatus.equals("non-premium") && purchaseAmount > 2000) 
        {
            discount = 0.15 * purchaseAmount;
        }

        
        if (discount > 0) 
        {
            System.out.println("You are eligible for a discount of: " + discount);
           
        } else 
        {
            System.out.println("Sorry, you are not eligible for any discounts.");
            
        }

        scanner.close();
    }
}
