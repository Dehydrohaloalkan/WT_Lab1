package task04;

import task04.repositories.ArrayRepository;
import task04.services.PrimeFinder;

import java.util.Arrays;

public class task04 {
    public static void main(String[] args) {
        var arrayRepository = new ArrayRepository();

        var array = arrayRepository.getNextArray();
        var result = PrimeFinder.findIndexes(array);

        System.out.println("Result: " + (result.length == 0 ? "Without prime numbers" : Arrays.toString(result)));
    }
}