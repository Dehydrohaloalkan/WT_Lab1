package task07.services;

public class GnomeSorter {
    public static void sort(int[] array){
        int i = 0;

        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i -= i != 0 ? 1 : 0;
            } else
                i++;
        }
    }
}
