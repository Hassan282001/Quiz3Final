import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void multiply() {
        // Test with two positive numbers
        assertEquals(20, Main.multiply(4, 5));

        // Test with one positive and one negative number
        assertEquals(-20, Main.multiply(4, -5));

        // Test with zero
        assertEquals(0, Main.multiply(4, 0));

        // Edge case: both numbers are zero
        assertEquals(0, Main.multiply(0, 0));
    }

    @Test
    public void multiplyUsingLoop() {
        // Test with two positive numbers
        assertEquals(20, Main.multiplyUsingLoop(4, 5));

        // Test with one positive and one negative number
        assertEquals(-20, Main.multiplyUsingLoop(4, -5));

        // Test with zero as one of the factors
        assertEquals(0, Main.multiplyUsingLoop(4, 0));

        // Test with zero as both factors
        assertEquals(0, Main.multiplyUsingLoop(0, 5));
    }

    @Test
    public void multiplyUsingShift() {
        // Test with two positive numbers
        assertEquals(20, Main.multiplyUsingShift(4, 5));

        // Test with one positive and one negative number
        assertEquals(-20, Main.multiplyUsingShift(4, -5));

        // Test with zero as one of the factors
        assertEquals(0, Main.multiplyUsingShift(4, 0));

        // Edge case: test with larger numbers
        assertEquals(1024, Main.multiplyUsingShift(32, 32));
    }
}
