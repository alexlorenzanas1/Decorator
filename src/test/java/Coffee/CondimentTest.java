package Coffee;
import org.junit.Test;
import static org.junit.Assert.*;
public class CondimentTest {
    @Test
    public void testMilkOnEspresso() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        assertEquals("Espresso, Milk", beverage.getDescription());
        assertEquals(2.09, beverage.cost(), 0.01);
    }

    @Test
    public void testMochaOnDarkRoast() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        assertEquals("Dark Roast Coffee, Mocha", beverage.getDescription());
        assertEquals(1.19, beverage.cost(), 0.01);
    }

    @Test
    public void testSoyOnHouseBlend() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        assertEquals("House Blend Coffee, Soy", beverage.getDescription());
        assertEquals(1.04, beverage.cost(), 0.01);
    }

    @Test
    public void testMultipleCondimentsOnDecaf() {
        Beverage beverage = new Decaf();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        assertEquals("Decaf Coffee, Soy, Mocha, Milk", beverage.getDescription());
        assertEquals(1.50, beverage.cost(), 0.01);
    }
}