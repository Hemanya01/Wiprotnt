package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
	public String getModelName() 
	{
        return "Hero Splendor";
    }
    public String getRegistrationNumber() 
    {
        return "AP39AB1234";
    }
    public String getOwnerName() 
    {
        return "Ravi";
    }
    public int getSpeed() 
    {
        return 75;
    }
    public void radio() 
    {
        System.out.println("Radio is ON");
    }
}
