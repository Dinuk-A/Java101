package org.example.concepts.basics;

public class L1_DataTypesExm {

    // Primitive types
    byte age = 27;
    short year = 2027;
    
    int orderCount = 5000000;
    int sameOrderCount = 5_000_000; 
    //we can put underscores to improve readability, '_' s can be putted in any pattern except in start and end

    long distanceToSun = 148_000_000_000L;
    //'L' is required

    float cost = 75.50f;
    //'f' is required

    double morePi = 3.1458897459775;

    char currency = '$'; 
    // single quotes, default is '\u0000'

    boolean isAvailable = true;
    //default is 'false'
   
    // Non primitive (REFERENCE TYPE == stores a memeory address to where the actual data is lived)
    String shopName = "ABC Store"; // double quotes
    //more === arrays, maps, objects, etc

    // ===================================
    // TYPE CASTING

    // 1 Widening Casting (smaller => larger.... automatically)
    // byte -> short -> char -> int -> long -> float -> double
    int myInt = 7;
    double myDouble = myInt;

    // 2 Narrowing Casting (larger => smaller... manually)
    // double -> float -> long -> int -> char -> short -> byte
    double myDoubleTwo = 9.78d;
    int myIntTwo = (int) myDoubleTwo;

    //String cant be type casted...its a non primitive type, to do that Wrappers are needed

}
