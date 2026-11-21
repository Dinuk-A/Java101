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

    // find 2nd highest
    public static void findSecMax(int[] intArr) {

        int max = intArr[0];
        int sec = intArr[0];

        for(int i = 0; i< intArr.length; i++){

            int currentValue = intArr[i];

            if (currentValue > max) {
                sec = max;
                max = currentValue;
            } else if( currentValue< max && currentValue> sec ){
                sec = currentValue;
            }
        }

        System.out.println(sec);

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

    public static void findSecMin(int[] intArr) {

        int min = intArr[0];
        int secMin = intArr[0];
        
        for (int i = 0; i < intArr.length; i++) {
            
            int currentval = intArr[i];
            
            if(currentval<min){
                secMin = min;
                min = currentval;
            }else if(currentval>min && currentval<secMin){
                secMin = currentval;
            }
        }

        System.out.println(secMin);

    }
}
