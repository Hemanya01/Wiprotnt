package miniproject;

public class MiniProject5Box {
	private double length;
    private double width;
    private double height;
    public  MiniProject5Box(double length, double width, double height) 
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength() 
    {
        return length;
    }
    public double getWidth() 
    {
        return width;
    }
    public double getHeight() 
    {
        return height;
    }
    public double getVolume() 
    {
        return length * width * height;
    }
    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (!(obj instanceof  MiniProject5Box))
            return false;
        MiniProject5Box b = ( MiniProject5Box) obj;
        return Double.compare(getVolume(), b.getVolume()) == 0;
    }
    public int hashCode() 
    {
        return Double.valueOf(getVolume()).hashCode();
    }
}
