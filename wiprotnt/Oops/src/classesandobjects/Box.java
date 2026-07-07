package ClassesandObjects;

public class Box {
	double width,height,depth;
	Box(double w,double h,double d) 
	{
        width = w;
        height = h;
        depth = d;
    }
	double volume() 
	{
        return width * height * depth;
    }
	public static void main(String[] args) 
	{
        Box b = new Box(10, 5, 3);
        System.out.println("Volume of Box: " + b.volume());
    }

}
