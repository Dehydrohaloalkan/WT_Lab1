package task02.repositories;

import task02.model.ComplexFigure;
import task02.model.Point;
import task02.model.Rectangle;

public class ComplexFigureRepository {
    public ComplexFigure getNextComplexFigure(){
        var complexFigure = new ComplexFigure();
        complexFigure.addFigure(new Rectangle(new Point(-6, 0), new Point(6, -3)));
        complexFigure.addFigure(new Rectangle(new Point(-4, 5), new Point(4, 0)));
        return complexFigure;
    }
}
