package org.example;

import org.example.challenges.ReverseStrings;

public class App {

    // MAIN METHOD
    public static void main(String[] args) {

        // ############### TESTING PRACTICLES GO BELOW ###############
        ReverseStrings.revStrWithConcat("dinukaaa");

        System.out.println("==================================");

    }

    // FIRST METHOD (SHOW APP HAS STARTED)
    // in main>>> start();
    public static void start() {
        System.out.println("Application Has Started");
    }

    // PASSING A VALUE
    // in main>>> welcome("Programmer");
    public static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    // SHOWCASE THE USE OF RETURN
    // in main >> System.out.println(getGreeting("Developer"));
    public static String getGreeting(String name) {
        return "Hello " + name;
    }

}
