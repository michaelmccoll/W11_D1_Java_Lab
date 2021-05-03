import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3,calc.Add(1,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(5,calc.Subtract(10,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(100,calc.Multiply(25,4));
    }

    @Test
    public void canDivide(){
        assertEquals(3,calc.Divide(9,3));
    }
}
