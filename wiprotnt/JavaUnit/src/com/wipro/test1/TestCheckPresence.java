package com.wipro.test1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.wipro.task1.DailyTask1;
public class TestCheckPresence {

	@Test
	public void testCheckPresence() 
	{
        DailyTask1 obj = new DailyTask1();
        int[] arr = {5,2,8,1,3};
        assertTrue(obj.checkPresence(arr,8));
        assertFalse(obj.checkPresence(arr,10));
    }
}
