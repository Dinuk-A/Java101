package org.example.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

    // find duplicated characters in a string
    // programming123
    public static void findDuplicatedChars(String givenString) {

        char[] strAsCharArray = givenString.replaceAll("\\s", "").toCharArray();
        Set<Character> uniques = new HashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();

        for (char c : strAsCharArray) {
            if (!uniques.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Following characters are duplicated");
        for (char c : duplicates) {
            System.out.println(c);
        }

    }

    // find first non repeated character
    // "aabbcdde"
    public static void findFirstUnqChar(String givenString) {

        char[] txtAsCharArr = givenString.replaceAll("\\s", "").toCharArray();
        Map<Character, Integer> frqCounter = new LinkedHashMap<>();

        for (char c : txtAsCharArr) {
            frqCounter.put(c, frqCounter.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frqCounter.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");

    }

    // search a value in an array
    // use element.equals(target) for generic types
    public static void findValueInArr(int[] arr, int target) {

        boolean isFound = false;

        for (int d : arr) {
            if (d == target) {
                isFound = true;
                System.out.println("Target found");
                break;
            }
        }

        if (!isFound) {
            System.out.println("Target not found");
        }

    }

    // count vowels in a string
    public static void countVowels(String givenString) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int vowelsCount = 0;

        char[] strAsArr = givenString.toCharArray();

        for (char c : strAsArr) {
            if (vowels.contains(Character.toLowerCase(c))) {
                vowelsCount++;
            }
        }

        System.out.println(vowelsCount + " Vowels Found");

    }

    // count constants in a string
    public static void countConstants(String givenString) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int constantsCount = 0;

        char[] strAsArr = givenString.toCharArray();

        for (char c : strAsArr) {
            if (Character.isLetter(c) && !vowels.contains(Character.toLowerCase(c))) {
                constantsCount++;
            }
        }

        System.out.println(constantsCount + " Constants Found");

    }

    // count digits in a string
    public static void countDigits(String givenString) {

        char[] txtArr = givenString.toCharArray();
        int digitCount = 0;

        for (char c : txtArr) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println(digitCount + " Digits Found");

    }

}
