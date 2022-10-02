package task01;

import task01.repositories.DoubleRepository;
import task01.services.CalculatorService;

public class task01 {
    public static void main(String[] args) {
        var doubleRepository = new DoubleRepository();

        double x = doubleRepository.GetNextDouble(), y = doubleRepository.GetNextDouble();
        System.out.println("X: " + x + ", Y: " + y);

        var calculator = new CalculatorService();
        double result = calculator.calc(x, y);
        System.out.println("Result: " + result);
    }
}
