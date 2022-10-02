package task03.repositories;

public class DoubleRepository {
    private static final double[] DEFAULT_DOUBLES = {0.5, 2.5, 0.5};

    private int index = 0;

    public double GetNextDouble(){
        return DEFAULT_DOUBLES[index++ % DEFAULT_DOUBLES.length];
    }
}
