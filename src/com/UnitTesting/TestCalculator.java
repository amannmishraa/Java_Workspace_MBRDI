package com.UnitTesting;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestCalculator {
    @Test
    public void testfindbig(){
        Calculator obj = new Calculator();
        assertEquals(20,obj.FindBig(10,20));
    }
    @Test
    public void testfindsmall(){
        Calculator obj = new Calculator();
        assertEquals(10,obj.FindSmall(10,20));

    }
}
