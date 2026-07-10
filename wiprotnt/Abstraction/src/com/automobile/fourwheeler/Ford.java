package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle {
	public String getModelName() 
	{
        return "Ford EcoSport";
    }
    public String getRegistrationNumber() 
    {
        return "AP39BB5678";
    }
    public String getOwnerName() 
    {
        return "Hemanya";
    }
    public int speed() 
    {
        return 140;
    }
    public int tempControl() 
    {
        System.out.println("Air Conditioner Started");
        return 1;
    }
}
