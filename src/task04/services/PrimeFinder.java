package task04.services;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static int[] findIndexes(int[] array){
        var result = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (PrimeChecker.isPrime(array[i])) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
