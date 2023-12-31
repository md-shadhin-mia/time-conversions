package com.shadhin;



// A class that contains the methods to be tested
public class HoursUtils {

// The methods are the same as the ones I wrote

    // A method that takes a double value as an argument and checks if it is a valid hour format
    public static void checkHourFormat(double hour) throws NumberFormatException {
// Format the hour to two decimal places
        String format = String.format("%.2f", hour);
// Split the hour into hours and minutes
        String[] parts = format.split("\\.");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
// Check if the hours and minutes are within the valid range
        if ( minutes < 0 || minutes > 59 || hours < 0 ) {
// Throw a NumberFormatException with a message
            throw new NumberFormatException("Invalid hour format: " + format + ". It should be H.i");
        }
    }

    // A method that takes an array of hours and returns their sum
    public static String sumHours(double[] hoursArray) {
// Initialize the total hours and minutes
        int totalHours = 0;
        int totalMinutes = 0;

// Loop through the array of hours
        for (double time : hoursArray) {
            checkHourFormat(time);
// Format the time to two decimal places
            String format = String.format("%.2f", time);
// Split the time into hours and minutes
            String[] parts = format.split("\\.");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

// Add the hours and minutes to the totals
            totalHours += hours;
            totalMinutes += minutes;

// Adjust the totals if minutes exceed 60
            if (totalMinutes >= 60) {
                totalHours += totalMinutes / 60;
                totalMinutes = totalMinutes % 60;
            }
        }

// Format and return the result
        return String.format("%02d.%02d", totalHours, totalMinutes);
    }

    public static String multiplyHour(double hour, double number) {
        checkHourFormat(hour);
// Format the hour to two decimal places
        String format = String.format("%.2f", hour);

// Split the hour into hours and minutes
        String[] parts = format.split("\\.");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
// Calculate the total minutes
        int totalMinutes = (hours * 60) + minutes;

// Multiply the total minutes
        int resultMinutes = (int) (totalMinutes * number);

// Calculate the new hours and minutes
        int newHours = resultMinutes / 60;
        int newMinutes = resultMinutes % 60;

// Format and return the result
        return String.format("%02d.%02d", newHours, newMinutes);
    }


    // A method that takes a decimal number of hours and returns a flatten number of hours
    public static double flattenHours(double hour) {
        checkHourFormat(hour);
// Extract the integer and fractional parts of the hours
        String format = String.format("%.2f", hour);
        String[] parts = format.split("\\.");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
// Divide the minutes by 60
        double fracPart = (double) minutes / 60;
        // Add the hours and the fractional part
        double floatValue = hours + fracPart;
        // Round to two decimal places
        floatValue = Math.round(floatValue * 100.0) / 100.0;
        // Return the flatten hours
        return floatValue;
    }
}