package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationTests {

	public final TimeToWords timeToWords= new TimeToWords(); 

    @Test
    public void testConvertTimeToWords() {

        // test case to check time

        assertEquals("It's three twenty five", timeToWords.checkTime("3:25"));

        // test to check Midday

        assertEquals("It's Midday", timeToWords.checkTime("12:00"));

        // test case to check Midnight

        assertEquals("It's Midnight", timeToWords.checkTime("00:00"));

    }

}
