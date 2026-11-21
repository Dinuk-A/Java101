package org.example.challenges;

public class MoreReversals {

    // 1 Reverse a sentence
    // this is as same as string reversal
    public static void reverseSentence(String givenSentenceString) {

        int oriStrLength = givenSentenceString.length();
        char[] reversed = new char[oriStrLength];

        int left = 0;
        int right = oriStrLength - 1;

        for (int i = 0; i < oriStrLength; i++) {
            reversed[i] = givenSentenceString.charAt(oriStrLength - 1 - i);
        }

        System.out.println("Original String: " + givenSentenceString);
        System.out.println("Reversed String: " + String.valueOf(reversed));

    }

    // reverse the order of words in a sentence, not whole sentence
    // "Hello Im Dinuka" >>> "Dinuka Im Hello"
    public static void reverseWords(String givenSentenceString) {

        String[] words = givenSentenceString.split(" ");
        String[] reversedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - i - 1];
        }

        String reversed = String.join(" ", reversedWords);

        System.out.println(reversed);

    }

    // reverse a digit (123456 > 654321)
    public static void reverseDigitsUsingStrings(int givenDigit) {

        String digitAsString = String.valueOf(givenDigit);
        System.out.println(digitAsString);

        String reversed = "";

        for (int i = 0; i < digitAsString.length(); i++) {
            reversed = reversed.concat(String.valueOf(digitAsString.charAt(digitAsString.length() - 1 - i)));
        }

        Integer revDigit = Integer.parseInt(reversed);

        System.out.println("Reversed Digit: " + revDigit);

    }

    // // reverse a digit using math
    // 6598784 > 4878956
    public static void reverseDigitsUsingMath(int givenDigit) {

        int originalDigit = givenDigit;
        int reversedDigit = 0;

        while (givenDigit > 0) {

            int lastDigit = givenDigit % 10;

            reversedDigit = lastDigit + reversedDigit * 10;

            givenDigit = givenDigit / 10;

        }

        System.out.println("Given Digit: " + originalDigit);
        System.out.println("Reversed Digit: " + reversedDigit);

    }
}
