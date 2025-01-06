package com.example;

/**
 * A Calculator class providing basic and advanced arithmetic operations.
 */
public class Calculator {

    // ------------------ Basic Arithmetic Operations ------------------


    /**
     * Subtracts the second integer from the first.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of a / b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Finds the modulus of the first integer divided by the second.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder of a % b
     * @throws ArithmeticException if b is zero
     */
    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a % b;
    }

    // ------------------ Advanced Arithmetic Operations ------------------

    /**
     * Raises the base to the power of the exponent.
     *
     * @param base     the base
     * @param exponent the exponent
     * @return the result of base^exponent
     */
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Computes the square root of a number.
     *
     * @param a the number
     * @return the square root of a
     * @throws IllegalArgumentException if a is negative
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }
        return Math.sqrt(a);
    }

    /**
     * Computes the factorial of a non-negative integer.
     *
     * @param n the integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute factorial of a negative number");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ------------------ Helper Methods ------------------

    /**
     * Validates that a number is non-negative.
     *
     * @param number the number to validate
     * @throws IllegalArgumentException if the number is negative
     */
    private void validateNonNegative(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
}
