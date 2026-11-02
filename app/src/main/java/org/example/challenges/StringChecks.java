package org.example.challenges;

import java.util.Arrays;

public class StringChecks {

    // Anagram check
    // #1
    public static void checkAnagramCharArr(String first, String two) {

        char[] firstArr = first.toCharArray();
        char[] secArr = two.toCharArray();

        Arrays.sort(firstArr);
        Arrays.sort(secArr);

        if (Arrays.equals(firstArr, secArr)) {
            System.out.println("'" + first + "' and '" + two + "' are anagrams");
        } else {
            System.out.printf(" '%s'  and '%s' are not anagrams", first, two);
        }

    }

    // Palindrome check
    // #1
    public static void checkPalindrome(String wordToCheck) {

        boolean isPalindrome = true;
        String txt = wordToCheck.toLowerCase();
        int left = 0;
        int right = txt.length() - 1;

        while (left < right) {
            if (txt.charAt(left) != txt.charAt(right)) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.printf("%s is a palindrome%n", wordToCheck);
        } else {
            System.out.printf("%s is not a palindrome%n", wordToCheck);
        }

    }

}
