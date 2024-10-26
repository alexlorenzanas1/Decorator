package Coffee;
import org.junit.Test;
import static org.junit.Assert.*;
public class DecafTest {
    @Test
    public void testDecaf() {
        Beverage beverage = new Decaf();
        assertEquals("Decaf Coffee", beverage.getDescription());
        assertEquals(1.05, beverage.cost(), 0.01);
    }
    @Test
    public void testDecafWithSoyAndMocha() {
        Beverage beverage = new Decaf();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        assertEquals("Decaf Coffee, Soy, Mocha", beverage.getDescription());
        assertEquals(1.40, beverage.cost(), 0.01);
    }
}
