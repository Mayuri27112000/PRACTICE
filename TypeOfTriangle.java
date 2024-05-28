import java.util.Scanner;

public class Triangle{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        
        String triangleType = determineTriangleType(side1, side2, side3);

       
        System.out.println("It is a" + triangleType + " triangle.");

        scanner.close();
    }

    
    public static String determineTriangleType(double side1, double side2, double side3) 
    {
        if (side1 == side2 && side2 == side3) 
        {
            return "equilateral";
        } else if (side1 == side2 || side2 == side3 || side1 == side3) 
        {
            return "isosceles";
        } else 
        {
            return "scalene";
        }
    }
}
