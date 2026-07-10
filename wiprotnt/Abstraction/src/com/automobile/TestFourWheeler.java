package com.automobile;
import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;
public class TestFourWheeler {
	public static void main(String[] args) 
	{
        Logan logan = new Logan();
        System.out.println("Model : " + logan.getModelName());
        System.out.println("Registration No : " + logan.getRegistrationNumber());
        System.out.println("Owner : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed());
        logan.gps();
        System.out.println();
        Ford ford = new Ford();
        System.out.println("Model : " + ford.getModelName());
        System.out.println("Registration No : " + ford.getRegistrationNumber());
        System.out.println("Owner : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed());
        ford.tempControl();
    }
}
