//create a class cylinder and use getter and setters to set its radius and height 

package practicesets;


public class Cylinder 
{
    private int radius;
    private int height;
    
    
	
	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public static void main(String[] args) 
	{
       Cylinder cy=new Cylinder();
       cy.setHeight(10);
       System.out.println(cy.getHeight());
       cy.setRadius(20);
       System.out.println(cy.getRadius());

	}

}
