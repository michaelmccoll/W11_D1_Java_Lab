import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer xerox;
    @Before
    public void before(){
        xerox = new Printer(100);
    }

    @Test
    public void printing(){
        xerox.Print(10,2);
        assertEquals(80,xerox.getPages());
        assertEquals(80,xerox.getToner());
    }


}
