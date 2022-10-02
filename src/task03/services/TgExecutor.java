package task03.services;

import java.util.HashMap;
import java.util.Map;

public class TgExecutor {
    double a;
    double b;
    double h;

    public TgExecutor(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Map<Double, Double> execute(){
        Map<Double, Double> result = new HashMap<>();
        for (double i = a; i <= b; i += h) {
            result.put(i, Math.tan(i));
        }
        return result;
    }
}
