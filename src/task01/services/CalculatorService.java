package task01.services;

public class CalculatorService {
    public double calc(double x, double y){
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return numerator/ denominator + x;
    }
}
