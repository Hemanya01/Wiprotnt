package interfaces;

public class Car implements Vehicle, FourWheeler {
	public void message() 
	{
        Vehicle.super.message();
        System.out.println("Inside Car");
    }
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.message();
    }
}
