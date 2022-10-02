package task07;

import task07.repositories.ArrayRepository;
import task07.services.GnomeSorter;

import java.util.Arrays;

public class task07 {
    public static void main(String[] args) {
        var arrayRepository = new ArrayRepository();

        var array = arrayRepository.getNextArray();
        GnomeSorter.sort(array);

        System.out.println("Result: " + Arrays.toString(array));
    }
}
