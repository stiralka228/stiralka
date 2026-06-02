package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("A man a plan a canal Panama"));
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
        assertNull(utils.reverse(null));
    }

    @Test
    void testCountVowels() {
        assertEquals(2, utils.countVowels("hello"));
        assertEquals(5, utils.countVowels("education"));
        assertEquals(0, utils.countVowels("rhythm"));
        assertEquals(0, utils.countVowels(null));
    }
}
