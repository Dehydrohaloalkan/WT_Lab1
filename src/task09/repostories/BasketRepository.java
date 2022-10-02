package task09.repostories;

import task09.model.Ball;
import task09.model.Basket;
import task09.model.Color;

import java.util.Random;

public class BasketRepository {

    public Basket getNextBasket (int countOfBalls){
        var random = new Random();
        var result = new Basket();

        for (int i = 0; i < countOfBalls; i++){
            Ball ball = new Ball(random.nextDouble() * 10, Color.values()[random.nextInt(Color.values().length)]);
            result.addBall(ball);
        }

        return result;
    }
}
