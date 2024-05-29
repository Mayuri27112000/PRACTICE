import java.util.Scanner;

class AreaOfRect
{
  double len,wid;
  double area;
  Scanner sc = new Scanner(System.in);

  public void input()
   {
     System.out.println("Enter length:");
     len=sc.nextDouble();
     System.out.println("Enter width:");
     wid=sc.nextDouble();
    }
    
   public void calculateArea()
    {
     area=len*wid;
     }
     
    public void output()
    {
      System.out.println("Area of rectangle is :"+area);
    }

    public static void main(String args[])
   { 
   AreaOfRect a= new AreaOfRect();
    a.input();
    a.calculateArea();
    a.output();
   }
}
