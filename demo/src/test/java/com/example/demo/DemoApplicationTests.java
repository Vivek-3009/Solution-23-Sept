package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoApplicationTests {

	@Autowired
	TimeToWords timeToWords;
    @Test
    public void testConvertTimeToWords() {

        // test case to check time

        assertEquals("It's three twenty", timeToWords.checkTime("3:25"));

        // test to check Midday

        assertEquals("It's Midday", timeToWords.checkTime("12:00"));

        // test case to check Midnight

        assertEquals("It's Midnight", timeToWords.checkTime("00:00"));

    }

}
