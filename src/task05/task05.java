package task05;

import task05.repositories.ArrayRepository;
import task05.services.SequenceFinder;

import java.util.Arrays;

public class task05 {
    public static void main(String[] args) {
        var arrayRepository = new ArrayRepository();

        var array = arrayRepository.getNextArray();
        var result = SequenceFinder.find(array);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Result: " + result);
    }
}
