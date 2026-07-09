package polymorphism;

public class Apple extends Fruit {
	public Apple() 
	{
        super("Apple", "Sweet", "Medium");
    }
    public void eat() 
    {
        System.out.println("Eating an Apple tastes Sweet.");
    }
}
