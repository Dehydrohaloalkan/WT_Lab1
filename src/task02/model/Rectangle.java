package task02.model;

public class Rectangle implements Figure {
    public Point leftTop, rightBottom;

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.leftTop = new Point(Math.min(firstPoint.x, secondPoint.x), Math.max(firstPoint.y, secondPoint.y));
        this.rightBottom = new Point(Math.max(firstPoint.x, secondPoint.x), Math.min(firstPoint.y, secondPoint.y));
    }

    @Override
    public boolean isPointIn(Point point) {
        return (point.x >= leftTop.x && point.x <= rightBottom.x) && (point.y <= leftTop.y && point.y >= rightBottom.y);
    }
}
