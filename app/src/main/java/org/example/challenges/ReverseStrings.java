package org.example.challenges;

public class ReverseStrings {

    // 1
    // reverse a string #1 - using stringbuilder
    // in main > ReverseThings.reverseStrUsingStrBuilder("hello");
    public static void reverseStrUsingStrBuilder(String givenStr) {

        StringBuilder reversed = new StringBuilder();

        for (int i = givenStr.length() - 1; i >= 0; i--) {
            reversed.append(givenStr.charAt(i));
        }

        System.out.println("Reversing a String using StringBuilder");
        System.out.println("Original Str: " + givenStr);
        System.out.println("Reversed Str: " + reversed);
    }

    // 2
    // reverse a string #2 - using char arrays
    public static void reverseStrUsingCharArray(String givenStr) {

        int originalLength = givenStr.length();
        char[] reversedArr = new char[originalLength];

        for (int i = 0; i < originalLength; i++) {
            reversedArr[i] = givenStr.charAt(originalLength - 1 - i);
        }

        System.out.println("Reversing a String using Char Array");
        System.out.println("Original Str: " + givenStr);
        System.out.println("Reversed String: " + String.valueOf(reversedArr));

    }

    // 3
    // reverse a string #3 - using 2 pointers
    public static void revStrUsingTwoPointers(String givenStr) {

        int originalLength = givenStr.length();
        int left = 0;
        int right = originalLength - 1;

        char[] oriStrArr = givenStr.toCharArray();

        while (left < right) {

            char temp = oriStrArr[left];

            oriStrArr[left] = oriStrArr[right];

            oriStrArr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversing a String using Two Pointers");
        System.out.println("Original Str: " + givenStr);
        System.out.println("Reversed String: " + String.valueOf(oriStrArr));

    }

    // 4
    // reverse a string with concat
    public static void revStrWithConcat(String givString) {

        String reversed = "";

        for (int i = 0; i < givString.length(); i++) {

            reversed = reversed.concat(
                    String.valueOf(givString.charAt(givString.length() - 1 - i)));

        }

        System.out.println("Reversing a String using Concat");
        System.out.println("Original Str: " + givString);
        System.out.println("Reversed Str: " + reversed);

    }

}
