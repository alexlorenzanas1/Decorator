package Coffee;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String toString() {
        return "Decaf{}";
    }
}