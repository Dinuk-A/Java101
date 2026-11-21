package org.example.challenges;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsInvolved {
    
    //find duplicated elements in an array and remove them
    // for any type of arrays
    public static <T> void removeDuplicatedElementsOfArray(T[] array) {

        Set<T> uniquesOnly = new LinkedHashSet<>();

        for(T element: array){
            uniquesOnly.add(element);
        }

        Object[] uniqueArray = uniquesOnly.toArray();

        System.out.println("Duplications removed, new array: " + Arrays.toString(uniqueArray));
        
    }

}
