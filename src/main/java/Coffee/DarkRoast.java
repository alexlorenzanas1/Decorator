package Coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String toString() {
        return "DarkRoast{}";
    }
}