package Coffee;
import org.junit.Test;
import static org.junit.Assert.*;

public class EspressoTest {
    @Test
    public void testEspresso() {
        Beverage beverage = new Espresso();
        assertEquals("Espresso", beverage.getDescription());
        assertEquals(1.99, beverage.cost(), 0.01);
    }

    @Test
    public void testEspressoWithMilk() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);

        assertEquals("Espresso, Milk", beverage.getDescription());
        assertEquals(2.09, beverage.cost(), 0.01);
    }

    @Test
    public void testEspressoWithAllCondiments() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);

        assertEquals("Espresso, Milk, Mocha, Soy", beverage.getDescription());
        assertEquals(2.44, beverage.cost(), 0.01);
    }
}
