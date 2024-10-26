package Coffee;
import org.junit.Test;
import static org.junit.Assert.*;

public class HouseBlendTest {
    @Test
    public void testHouseBlend() {
        Beverage beverage = new HouseBlend();
        assertEquals("House Blend Coffee", beverage.getDescription());
        assertEquals(0.89, beverage.cost(), 0.01);
    }

    @Test
    public void testHouseBlendWithSoy() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);

        assertEquals("House Blend Coffee, Soy", beverage.getDescription());
        assertEquals(1.04, beverage.cost(), 0.01);
    }
}