package task01.repositories;

public class DoubleRepository {
    private static final double[] DEFAULT_DOUBLES = {1.7, 2.7};

    private int index = 0;

    public double GetNextDouble(){
        return DEFAULT_DOUBLES[index++ % DEFAULT_DOUBLES.length];
    }
}
