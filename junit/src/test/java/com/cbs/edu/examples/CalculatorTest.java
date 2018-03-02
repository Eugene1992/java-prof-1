package com.cbs.edu.examples;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    private int a;
    private int b;

    @BeforeClass
    public static void setUpAll() {
        System.out.println("Before class: ");
    }

    @Before
    public void setUp() {
        System.out.println("Before: ");
        calculator = new Calculator();
        a = 20;
        b = 10;
    }

    @Test
    public void minus() throws Exception {
        int expected = a - b;
        int actual = calculator.minus(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void minusWithZeroDivider() throws Exception {
        b = 0;
        int actual = calculator.divide(a, b);
    }

    @Test
    public void plus() throws Exception {
        int expected = a + b;
        int actual = calculator.plus(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Ignore
    @Test(timeout = 2L)
    public void time() throws Exception {
        int expected = a + b;
        int actual = calculator.plus(a, b);
        Assert.assertEquals(expected, actual);
    }
}