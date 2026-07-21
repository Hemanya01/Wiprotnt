package com.wipro.task1;
import java.util.Arrays;
public class DailyTask1 {
	public int[] sortValues(int[] arr) 
	{
        Arrays.sort(arr);
        return arr;
    }
    public boolean checkPresence(int[] arr,int value) 
    {
        Arrays.sort(arr);
        for(int i : arr) 
        {
            if(i==value)
                return true;
        }
        return false;
    }
}
