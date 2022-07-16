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
    @Test
    void Newlineignore() throws Exception {
        var calculator = new StringCalculator();
        assertEquals(23,calculator.add("10\n5,8"));
    }
    @Test
    void invalidinput() throws Exception{

        Exception exception = assertThrows(Exception.class, () -> {
            new StringCalculator().add("10,\n5");
        });
        String expectedMessage = "invalid input";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void singledelimiter() throws Exception{
        var calculator = new StringCalculator();
        assertEquals(6,calculator.add("//;\n;1;2;3"));
    }
}