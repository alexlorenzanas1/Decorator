package Coffee;

import lombok.Getter;

@Getter
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + ": $" + cost();
    }
}