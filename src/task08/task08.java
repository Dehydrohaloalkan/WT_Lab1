package task08;

import task08.repositories.ArrayRepository;
import task08.services.ArrayMerger;

import java.util.Arrays;

public class task08 {
    public static void main(String[] args) {
        var arrayRepository = new ArrayRepository();

        var a = arrayRepository.getNextArray();
        var b = arrayRepository.getNextArray();

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        var result = ArrayMerger.getMergeInstructions(a, b);

        System.out.println("result: ");
        for (int i = 0; i < b.length; i++){
            System.out.printf("input %f after A[%d] \n", b[i], result[i]);
        }
    }
}
