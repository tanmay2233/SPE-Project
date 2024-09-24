import org.example.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals("2.0", Main.squareRoot(4.0));
        assertEquals("Error: Cannot compute square root of negative number.", Main.squareRoot(-4.0));
        assertEquals("3.0", Main.squareRoot(9.0));
        System.out.println("Square Root passed Tests!");
    }

    @Test
    public void testFactorial() {
        assertEquals("120", Main.factorial(5.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", Main.factorial(-1.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", Main.factorial(4.5));
        assertEquals("1", Main.factorial(0));
        System.out.println("Factorial passed Tests!");
    }

    @Test
    public void testNaturalLog() {
        assertEquals("1.0", Main.naturalLog(Math.E));
        assertEquals("Error: Logarithm is defined for positive numbers only.", Main.naturalLog(0.0));
        assertEquals("Error: Logarithm is defined for positive numbers only.", Main.naturalLog(-3.0));
        System.out.println("Natural Logarithm passed Tests!");
    }

    @Test
    public void testPower() {
        assertEquals("8.0", Main.power(2.0, 3.0));
        assertEquals("1.0", Main.power(5.0, 0.0));
        assertEquals("0.25", Main.power(2.0, -2.0));
        System.out.println("Exponential passed Tests!");
    }

    @Test
    public void testAddition() {
        assertEquals("7.0", Main.add(3.0, 4.0));
        assertEquals("-1.0", Main.add(-5.0, 4.0));
        assertEquals("0.0", Main.add(2.0, -2.0));
        System.out.println("Addition passed Tests!");
    }

    @Test
    public void testMultiplication() {
        assertEquals("12.0", Main.multiply(3.0, 4.0));
        assertEquals("0.0", Main.multiply(0.0, 5.0));
        assertEquals("-6.0", Main.multiply(-2.0, 3.0));
        System.out.println("Multiplication passed Tests!");
    }

    @Test
    public void testDivision() {
        assertEquals("2.0", Main.divide(6.0, 3.0));
        assertEquals("Error: Division by zero is undefined.", Main.divide(5.0, 0.0));
        assertEquals("-2.5", Main.divide(-5.0, 2.0));
        System.out.println("Division passed Tests!");
    }
}
