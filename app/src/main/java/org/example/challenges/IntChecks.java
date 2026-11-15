package org.example.challenges;

public class IntChecks {

    // find Max - #1
    public static void findMaxNormally(int[] intArr) {

        while (intArr != null) {

            int max = intArr[0];
            for (int i = 0; i < intArr.length; i++) {
                if (intArr[i] > max) {
                    max = intArr[i];
                }
            }

            System.out.println("Max number is: " + max);
            break;

        }

        /*
         * int[] nums = { 45, 8, 999, -45, -1, 0, 475 };
         * IntChecks.findMaxNormally(nums);
         */

    }

    // find min -#1
    public static void findMinNOrmally(int[] intArr) {

        while (intArr != null) {

            int min = intArr[0];
            for (int i = 0; i <= intArr.length - 1; i++) {
                if (intArr[i] < min) {
                    min = intArr[i];
                }
            }

            System.out.println("Min number is: " + min);
            break;
        }

        /*
         * int[] nums = { -45, 8, -999, 100, -45, -1, 69, 475 };
         * IntChecks.findMinNOrmally(nums);
         */

    }
}
