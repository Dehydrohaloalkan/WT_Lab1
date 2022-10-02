package task09.model;

public class Ball {
    private final double weight;
    private final Color color;

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Ball(double weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return String.format("Weight: %f; Color: %s", this.getWeight(), this.getColor().name());
    }
}
