package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle {
	public String getModelName() 
	{
        return "Renault Logan";
    }
    public String getRegistrationNumber() 
    {
        return "AP39AA1234";
    }
    public String getOwnerName() 
    {
        return "Gowri";
    }
    public int speed() 
    {
        return 120;
    }
    public int gps() 
    {
        System.out.println("GPS Device Started");
        return 1;
    }
}
