package com.example;

public class StringUtils {

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    public int countVowels(String s) {
        if (s == null) {
            return 0;
        }
        return (int) s.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
}
