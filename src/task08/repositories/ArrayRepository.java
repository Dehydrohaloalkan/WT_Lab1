package task08.repositories;

public class ArrayRepository {
    private static final double[][] arrays = new double[][]{ {2, 4.5, 5, 6, 8}, {3, 4, 6.7, 7, 9} };

    private int index = 0;

    public double[] getNextArray(){
        return arrays[index++ % arrays.length];
    }
}
