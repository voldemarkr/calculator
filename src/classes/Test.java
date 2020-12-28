import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Tests {

    @Test
    void resultAddition() {
        CalculatorPanel calculator = new CalculatorPanel();
        calculator.setLastCommand("+");
        calculator.calculate(10);
        assertEquals(10, calculator.getResult());
    }

    @Test
    void resultMultiplication() {
        CalculatorPanel calculator = new CalculatorPanel();
        calculator.setLastCommand("-");
        calculator.calculate( 10);
        assertEquals(-10, calculator.getResult());
    }
}