import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;
    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void getVolume(){
        assertEquals(100,bottle.getVolume());
    }

    @Test
    public void takeDrink(){
        bottle.Drink();
        bottle.Drink();
        assertEquals(80,bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.Empty();
        assertEquals(0,bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.Fill();
        assertEquals(100,bottle.getVolume());
    }
}
