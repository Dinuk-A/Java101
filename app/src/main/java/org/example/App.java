package org.example;

import org.example.challenges.IntChecks;

public class App {

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("==================================");

        // ############### TESTING PRACTICLES GO BELOW ###############
        
        
         int[] nums = {11, 12, 13, 15, 16};
         IntChecks.findMissingNumInRange(nums);
         

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
