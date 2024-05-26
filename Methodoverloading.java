public class OverloadExample {
    // Method to print an integer
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Method to print a double
    public void print(double num) {
        System.out.println("Printing double: " + num);
    }

    // Method to print a string
    public void print(String str) {
        System.out.println("Printing string: " + str);
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        
        example.print(10);          // Calls the method with int parameter
        example.print(3.14);        // Calls the method with double parameter
        example.print("Hello");     // Calls the method with String parameter
    }
}
