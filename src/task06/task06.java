package task06;

import task06.repositories.ArrayRepository;
import task06.services.MatrixCreator;

import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {
        var arrayRepository = new ArrayRepository();

        var array = arrayRepository.getNextArray();
        var result = MatrixCreator.create(array);

        System.out.println("result: ");
        for (int[] line : result) {
            System.out.println(Arrays.toString(line));
        }
    }
}
