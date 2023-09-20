package com.shadhin;

public class Main {
    public static void main(String[] args) {
        try {
            double[] hoursArray = {8.5, 7.25, 6.4};

            // Validate an hour format
            HoursUtils.checkHourFormat(8.5);

            // Sum the hours in the array
            String totalHours = HoursUtils.sumHours(hoursArray);
            System.out.println("Total Hours: " + totalHours);

            // Multiply an hour
            String multipliedHour = HoursUtils.multiplyHour(8.5, 2);
            System.out.println("Multiplied Hour: " + multipliedHour);

            // Flatten an hour
            double flattenedHour = HoursUtils.flattenHours(8.5);
            System.out.println("Flattened Hour: " + flattenedHour);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}