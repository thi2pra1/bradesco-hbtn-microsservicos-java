package com.example.calculator.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        Double result = calculator.sum(10.0, 5.0);
        assertEquals(15.0, result);
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> {
            calculator.sum(null, 5.0);
        });

        assertThrows(NullPointerException.class, () -> {
            calculator.sum(10.0, null);
        });
    }

    @Test
    void subTest() {
        Double result = calculator.sub(10.0, 3.0);
        assertEquals(7.0, result);
    }

    @Test
    void divideTest() {
        Double result = calculator.divide(15.0, 3.0);
        assertEquals(5.0, result);
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
    }

    @Test
    void factorialTest() {
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(24, calculator.factorial(4));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(1, calculator.integerToBinary(1));
        assertEquals(101, calculator.integerToBinary(5));
        assertEquals(10100, calculator.integerToBinary(20));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("1", calculator.integerToHexadecimal(1));
        assertEquals("37", calculator.integerToHexadecimal(55));
        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);
        int result = calculator.calculeDayBetweenDate(date1, date2);
        assertEquals(14, result);
    }
}
