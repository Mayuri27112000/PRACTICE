import java.util.Scanner;

public class TicketPrice 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        System.out.print("Enter the time of the movie: ");
        int time = scanner.nextInt();

        
        int ticketPrice = 0;

        if (age < 5 || age >= 60) {
             ticketPrice = 0;
        } else if (time < 12) {
            
            ticketPrice = 250;
            
        } else if (time >= 17 && time <= 21) {
            
            ticketPrice = 300;
        } else {
            
            ticketPrice = 200;
        }

        
        System.out.println("Price is: " + ticketPrice);

        scanner.close();
    }
}
