import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd(){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator();
    assertEquals(2,calculator.subtract(4,2));
    }
    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.multiply(2,4));
    }
    @Test
    public void canDivide(){
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.divide(64,8));
    }
}
