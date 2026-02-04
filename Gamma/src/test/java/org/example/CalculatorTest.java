package org.example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAddPositiveNumbers(){

        Calculator cal = new Calculator();
        assertEquals(10, cal.add(5, 5));
    }
    @Test
    void testAddNegativeNumbers(){

        Calculator cal = new Calculator();
        assertEquals(-10, cal.add(-5, -5));
    }
    @Test
    void testAddWithZero(){

        Calculator cal = new Calculator();
        assertEquals(5, cal.add(0, 5));
    }

}