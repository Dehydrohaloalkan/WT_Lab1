package task02.model;

import java.util.LinkedList;

public class ComplexFigure {
    private final LinkedList<Figure> figures;

    public ComplexFigure(LinkedList<Figure> figures) {
        this.figures = figures;
    }

    public ComplexFigure() {
        this.figures = new LinkedList<>();
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }

    public void removeFigure(Figure figure){
        figures.remove(figure);
    }

    public boolean isPointIn(Point point){
        var result = false;
        for (var figure:figures) {
            result = result || figure.isPointIn(point);
        }
        return result;
    }
}
