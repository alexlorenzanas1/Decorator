package Coffee;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String toString() {
        return "HouseBlend{}";
    }
}