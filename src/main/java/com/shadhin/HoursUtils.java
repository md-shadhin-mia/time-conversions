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

    // A method that takes an hour and a number as arguments and returns their product

}