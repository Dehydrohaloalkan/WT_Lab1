package task02;

import task02.repositories.ComplexFigureRepository;
import task02.repositories.PointRepository;

public class task02 {
    public static void main(String[] args) {
        var pointRepository = new PointRepository();
        var complexFigureRepository = new ComplexFigureRepository();

        var point = pointRepository.getNextPoint();
        var complexFigure = complexFigureRepository.getNextComplexFigure();

        System.out.println("Point: " + point.toString());

        var result = complexFigure.isPointIn(point);

        System.out.println("Result: " + result);
    }
}
