import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals("Square root of 4.0 should be 2.0", 2.0, ScientificCalculator.squareRoot(4.0), 0.0001);
        assertEquals("Square root of -4.0 should give an error", "Error: Cannot compute square root of negative number.", ScientificCalculator.squareRoot(-4.0));
        assertEquals("Square root of 9.0 should be 3.0", 3.0, ScientificCalculator.squareRoot(9.0), 0.0001);
        System.out.println("testSquareRoot passed!");
    }

    @Test
    public void testFactorial() {
        assertEquals("Factorial of 5.0 should be 120", 120, (int) ScientificCalculator.factorial(5.0));
        assertEquals("Factorial of -1.0 should give an error", "Error: Factorial is defined for non-negative integers only.", ScientificCalculator.factorial(-1.0));
        assertEquals("Factorial of 4.5 should give an error", "Error: Factorial is defined for non-negative integers only.", ScientificCalculator.factorial(4.5));
        assertEquals("Factorial of 0 should be 1", 1, (int) ScientificCalculator.factorial(0.0));
        assertEquals("Factorial of 1.0 should be 1", 1, (int) ScientificCalculator.factorial(1.0));
        System.out.println("testFactorial passed!");
    }

    @Test
    public void testNaturalLog() {
        assertEquals("Natural log of e should be 1.0", 1.0, ScientificCalculator.naturalLog(Math.E), 0.0001);
        assertEquals("Natural log of 0 should give an error", "Error: Logarithm is defined for positive numbers only.", ScientificCalculator.naturalLog(0.0));
        assertEquals("Natural log of -3.0 should give an error", "Error: Logarithm is defined for positive numbers only.", ScientificCalculator.naturalLog(-3.0));
        assertEquals("Natural log of 1 should be 0.0", 0.0, ScientificCalculator.naturalLog(1.0), 0.0001);
        System.out.println("testNaturalLog passed!");
    }

    @Test
    public void testPower() {
        assertEquals("2 raised to power 3 should be 8.0", 8.0, ScientificCalculator.power(2.0, 3.0), 0.0001);
        assertEquals("5 raised to power 0 should be 1.0", 1.0, ScientificCalculator.power(5.0, 0.0), 0.0001);
        assertEquals("2 raised to power -2 should be 0.25", 0.25, ScientificCalculator.power(2.0, -2.0), 0.0001);
        System.out.println("testPower passed!");
    }

    @Test
    public void testAddition() {
        assertEquals("3.0 + 4.0 should be 7.0", 7.0, ScientificCalculator.add(3.0, 4.0), 0.0001);
        assertEquals("-5.0 + 4.0 should be -1.0", -1.0, ScientificCalculator.add(-5.0, 4.0), 0.0001);
        assertEquals("2.0 + -2.0 should be 0.0", 0.0, ScientificCalculator.add(2.0, -2.0), 0.0001);
        System.out.println("testAddition passed!");
    }

    @Test
    public void testMultiplication() {
        assertEquals("3.0 * 4.0 should be 12.0", 12.0, ScientificCalculator.multiply(3.0, 4.0), 0.0001);
        assertEquals("0.0 * 5.0 should be 0.0", 0.0, ScientificCalculator.multiply(0.0, 5.0), 0.0001);
        assertEquals("-2.0 * 3.0 should be -6.0", -6.0, ScientificCalculator.multiply(-2.0, 3.0), 0.0001);
        System.out.println("testMultiplication passed!");
    }

    @Test
    public void testDivision() {
        assertEquals("6.0 / 3.0 should be 2.0", 2.0, ScientificCalculator.divide(6.0, 3.0), 0.0001);
        assertEquals("Division by 0 should give an error", "Error: Division by zero is undefined.", ScientificCalculator.divide(5.0, 0.0));
        assertEquals("-5.0 / 2.0 should be -2.5", -2.5, ScientificCalculator.divide(-5.0, 2.0), 0.0001);
        System.out.println("testDivision passed!");
    }
}
