import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void EmptyString() throws Exception{
        var calculator = new StringCalculator();
        assertEquals(0,calculator.add(""));
    }
    @Test
    void Singlenumber() throws Exception{
        var calculator = new StringCalculator();
        assertEquals(5,calculator.add("5"));
    }
    @Test
    void Multinumber() throws Exception{
        var calculator = new StringCalculator();
        assertEquals(12,calculator.add("5,7"));
    }
}