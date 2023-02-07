package org.campus02.thaler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
    calculator = new Calculator(4,5);
    }

    @Test
    @DisplayName("Konstruktor Test")
    void testConstruktor(){
        int expectedNumber = 4;
        Assertions.assertEquals(expectedNumber,calculator.getA());

        Assertions.assertEquals(5, calculator.getB());
    }

    @Test
    void result() {
        String expected = "zwischen 0 und 10";
        Assertions.assertEquals(expected,calculator.result());
    }
}