package Coffee;
import org.junit.Test;
import static org.junit.Assert.*;
public class DarkRoastTest {
    @Test
    public void testDarkRoast() {
        Beverage beverage = new DarkRoast();
        assertEquals("Dark Roast Coffee", beverage.getDescription());
        assertEquals(0.99, beverage.cost(), 0.01);
    }
    @Test
    public void testDarkRoastWithMochaAndMilk() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        assertEquals("Dark Roast Coffee, Mocha, Milk", beverage.getDescription());
        assertEquals(1.29, beverage.cost(), 0.01);
    }
}
