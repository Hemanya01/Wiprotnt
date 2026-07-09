package polymorphism;

public class Orange extends Fruit{
	public Orange() 
	{
        super("Orange", "Tangy", "Large");
    }
    public void eat() 
    {
        System.out.println("Eating an Orange tastes sour and juicy.");
    }

}
