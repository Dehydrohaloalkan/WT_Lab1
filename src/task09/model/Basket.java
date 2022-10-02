package task09.model;

import java.util.ArrayList;
import java.util.Random;

public class Basket {
    private final ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<Ball>();
    }

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBall (Ball ball){
        balls.add(ball);
    }

    public void removeBall (Ball ball){
        balls.remove(ball);
    }

    public double getBallsWeight(){
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countByColor(Color color){
        int count = 0;
        for (Ball ball : balls){
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        int i = 0;
        var sb = new StringBuilder();

        for (Ball ball : balls) {
            sb.append(i++).append(" - ").append(ball.toString()).append("\n");
        }

        return sb.toString();
    }
}
