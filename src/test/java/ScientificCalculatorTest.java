import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals("2.0", ScientificCalculator.squareRoot(4.0));
        assertEquals("Error: Cannot compute square root of negative number.", ScientificCalculator.squareRoot(-4.0));
        assertEquals("3.0", ScientificCalculator.squareRoot(9.0));
    }

    @Test
    public void testFactorial() {
        assertEquals("120", ScientificCalculator.factorial(5.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", ScientificCalculator.factorial(-1.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", ScientificCalculator.factorial(4.5));
        assertEquals("1", ScientificCalculator.factorial(0));
    }

    @Test
    public void testNaturalLog() {
        assertEquals("1.0", ScientificCalculator.naturalLog(Math.E));
        assertEquals("Error: Logarithm is defined for positive numbers only.", ScientificCalculator.naturalLog(0.0));
        assertEquals("Error: Logarithm is defined for positive numbers only.", ScientificCalculator.naturalLog(-3.0));
    }

    @Test
    public void testPower() {
        assertEquals("8.0", ScientificCalculator.power(2.0, 3.0));
        assertEquals("1.0", ScientificCalculator.power(5.0, 0.0));
        assertEquals("0.25", ScientificCalculator.power(2.0, -2.0));
    }

    @Test
    public void testAddition() {
        assertEquals("7.0", ScientificCalculator.add(3.0, 4.0));
        assertEquals("-1.0", ScientificCalculator.add(-5.0, 4.0));
        assertEquals("0.0", ScientificCalculator.add(2.0, -2.0));
    }

    @Test
    public void testMultiplication() {
        assertEquals("12.0", ScientificCalculator.multiply(3.0, 4.0));
        assertEquals("0.0", ScientificCalculator.multiply(0.0, 5.0));
        assertEquals("-6.0", ScientificCalculator.multiply(-2.0, 3.0));
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", ScientificCalculator.divide(6.0, 3.0));
        assertEquals("Error: Division by zero is undefined.", ScientificCalculator.divide(5.0, 0.0));
        assertEquals("-2.5", ScientificCalculator.divide(-5.0, 2.0));
        System.out.println("testDivision passed!");
    }
}
