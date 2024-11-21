public class Main {

    /**
     * Simple multiplication method.
     *
     * @param a - first integer
     * @param b - second integer
     * @return - the product of a and b
     */
    public static int multiply(int a, int b) {
        // FIX: Replace 'a + b' with 'a * b' for correct functionality.
        return a * b;
    }

    /**
     * Method using loops for multiplication.
     *
     * @param a - first integer
     * @param b - second integer
     * @return - the product of a and b
     */
    public static int multiplyUsingLoop(int a, int b) {
        int absB = Math.abs(b); // Ensure 'b' is positive for the loop.
        int result = 0;
        for (int i = 0; i < absB; i++) {
            // FIX: Add 'a' repeatedly to correctly multiply.
            result += a;
        }
        // Adjust result for negative b.
        return (b < 0) ? -result : result;
    }

    /**
     * Method to multiply using bitwise shift.
     *
     * @param a - first integer
     * @param b - second integer
     * @return - the product of a and b
     */
    public static int multiplyUsingShift(int a, int b) {
        int absA = Math.abs(a); // Get the absolute value of 'a'.
        int absB = Math.abs(b); // Get the absolute value of 'b'.
        int result = 0;
        while (absB != 0) {
            if ((absB & 1) != 0) {
                // FIX: Add 'absA' when the last bit of 'absB' is 1.
                result += absA;
            }
            absA <<= 1; // Multiply 'absA' by 2.
            absB >>= 1; // Divide 'absB' by 2.
        }
        // FIX: Adjust the sign of the result based on inputs.
        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result;
    }
}
