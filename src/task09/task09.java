package task09;

import task09.model.Color;
import task09.repostories.BasketRepository;

public class task09 {
    public static void main(String[] args) {
        var basketRepository = new BasketRepository();
        var basket = basketRepository.getNextBasket(10);

        System.out.println("Balls: \n" + basket.toString());

        System.out.printf("Summary weight: %f \n", basket.getBallsWeight());
        System.out.printf("Count of blue balls: %d \n", basket.countByColor(Color.Blue));
    }
}
