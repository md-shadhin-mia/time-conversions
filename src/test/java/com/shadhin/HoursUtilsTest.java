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


}