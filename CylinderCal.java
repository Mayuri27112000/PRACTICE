package practicesets;

public class CylinderCal 
{
    
	private int radius;
    private int height;
    
    public CylinderCal()
    {
        this.radius = 4;
        this.height = 5;
    }

    public CylinderCal(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

	public int getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius) 
	{
		this.radius = radius;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public double SurfaceArea()
	{
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double Volume()
    {
        return Math.PI * radius * radius * height;
    }
	
	public static void main(String[] args) 
	{
		CylinderCal cy=new CylinderCal(20,30);
	    System.out.println(cy.Volume());
	    System.out.println(cy.SurfaceArea());
	}
}
