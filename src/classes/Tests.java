import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    CalculatorPanel calculator;

    public Tests() {
        calculator = new CalculatorPanel();
    }

    @Test
    public void checkResult() {
        calculator.setLastCommand("+");
        calculator.calculate(10);
        assertEquals(calculator.getResult(), 10.0, 1.0);
    }
}