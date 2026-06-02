package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(-1, calc.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-5, calc.subtract(2, 7));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(5, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
    }

    @Test
    void testFactorial() {
        assertEquals(1, calc.factorial(0));
        assertEquals(1, calc.factorial(1));
        assertEquals(120, calc.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-1));
    }
}
