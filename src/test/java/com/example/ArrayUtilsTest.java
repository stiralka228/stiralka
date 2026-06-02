package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {

    private final ArrayUtils utils = new ArrayUtils();

    @Test
    void testFindMax() {
        assertEquals(9, utils.findMax(new int[]{1, 3, 9, 2}));
        assertEquals(-1, utils.findMax(new int[]{-5, -1, -3}));
        assertThrows(IllegalArgumentException.class, () -> utils.findMax(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> utils.findMax(null));
    }

    @Test
    void testFindMin() {
        assertEquals(1, utils.findMin(new int[]{3, 1, 9, 2}));
        assertEquals(-5, utils.findMin(new int[]{-5, -1, -3}));
        assertThrows(IllegalArgumentException.class, () -> utils.findMin(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> utils.findMin(null));
    }

    @Test
    void testSum() {
        assertEquals(15, utils.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, utils.sum(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> utils.sum(null));
    }
}
