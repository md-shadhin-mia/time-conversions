package com.shadhin;

 import org.junit.jupiter.api.Test;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.junit.jupiter.api.Assertions.assertThrows;

public class HoursUtilsTest {

    // A test case for sumHours method with valid input
    @Test
    public void testSumHoursValid() {
        double[] input = {1.30, 2.45, 3.15, 4.00};
        String expected = "11.30";
        String actual = HoursUtils.sumHours(input);
        assertEquals(expected, actual);
    }

    // A test case for sumHours method with empty input
    @Test
    public void testSumHoursEmpty() {
        double[] input = {};
        String expected = "00.00";
        String actual = HoursUtils.sumHours(input);
        assertEquals(expected, actual);
    }

    // A test case for sumHours method with negative input
    @Test
    public void testSumHoursNegative() {

        double[] input = {-1.30, -2.45, -3.15, -4.00};
        assertThrows(NumberFormatException.class, ()->HoursUtils.sumHours(input) );
        // This should throw an exception
    }

    // A test case for sumHours method with invalid input
    @Test
    public void testSumHoursInvalid() {
        double[] input = {1.30, 2.45, 3.15, 4.99}; // The last value is not a valid hour format
        assertThrows(NumberFormatException.class, ()->HoursUtils.sumHours(input)); // This should throw an exception
    }

    // A test case for sumHours method with large input
    @Test
    public void testSumHoursLarge() {
        double[] input = {12.30, 23.45, 34.15, 45.00};
        String expected = "115.30";
        String actual = HoursUtils.sumHours(input);
        assertEquals(expected, actual);
    }


    // A test case for multiplyHour method with valid input
    @Test
    public void testMultiplyHourValid() {
        double hour = 1.30;
        double number = 2.5;
        String expected = "03.45";
        String actual = HoursUtils.multiplyHour(hour, number);
        assertEquals(expected, actual);
    }

    // A test case for multiplyHour method with zero input
    @Test
    public void testMultiplyHourZero() {
        double hour = 1.30;
        double number = 0;
        String expected = "00.00";
        String actual = HoursUtils.multiplyHour(hour, number);
        assertEquals(expected, actual);
    }

    // A test case for multiplyHour method with negative input
    @Test
    public void testMultiplyHourNegative() {
        double hour = -1.30;
        double number = 2.5;
        assertThrows(NumberFormatException.class,()->HoursUtils.multiplyHour(hour, number)); // This should throw an exception
    }

    // A test case for multiplyHour method with invalid input
    @Test
    public void testMultiplyHourInvalid() {
        double hour = 1.99; // This is not a valid hour format
        double number = 2.5;
        assertThrows(NumberFormatException.class, ()->HoursUtils.multiplyHour(hour, number)); // This should throw an exception
    }

    // A test case for multiplyHour method with large input
    @Test
    public void testMultiplyHourLarge() {
        double hour = 12.30;
        double number = 10;
        String expected = "125.00";
        String actual = HoursUtils.multiplyHour(hour, number);
        assertEquals(expected, actual);
    }

    // A test case for flattenHours method with valid input
    @Test
    public void testFlattenHoursValid() {
        double hours = 1.30;
        double expected = 1.5;
        double actual = HoursUtils.flattenHours(hours);
        assertEquals(expected, actual, 0.01); // The third argument is the delta for floating point comparison
    }

    // A test case for flattenHours method with zero input
    @Test
    public void testFlattenHoursZero() {
        double hours = 0;
        double expected = 0;
        double actual = HoursUtils.flattenHours(hours);
        assertEquals(expected, actual, 0.01); // The third argument is the delta for floating point comparison
    }

    // A test case for flattenHours method with negative input
    @Test
    public void testFlattenHoursNegative() {
        double hours = -1.30;
        assertThrows(NumberFormatException.class, ()->HoursUtils.flattenHours(hours));
    }

    // A test case for flattenHours method with invalid input
    @Test
    public void testFlattenHoursInvalid() {
        double hours = 1.99; // This is not a valid hour format
        assertThrows(NumberFormatException.class, ()->HoursUtils.flattenHours(hours));
    }

    // A test case for flattenHours method with large input
    @Test
    public void testFlattenHoursLarge() {
        double hours = 12.30;
        double expected = 12.5;
        double actual = HoursUtils.flattenHours(hours);
        assertEquals(expected, actual, 0.01); // The third argument is the delta for floating point comparison
    }

}