package task02.repositories;

import task02.model.Point;

public class PointRepository {
    public Point getNextPoint(){
        return new Point(3,5);
    }
}
