
# Hours Conversion Java Program

This Java program, `HoursUtils`, contains methods for performing various operations related to hours and time format conversion.

## Table of Contents
- [Overview](#overview)
- [Methods](#methods)
    - [checkHourFormat](#checkhourformat)
    - [sumHours](#sumhours)
    - [multiplyHour](#multiplyhour)
    - [flattenHours](#flattenhours)
- [Usage](#usage)

## Overview

The `HoursUtils` class provides the following functionalities:
- Validation of hour format.
- Summing up an array of hours.
- Multiplying an hour by a number.
- Flattening decimal hours to a simpler format.

## Methods

### `checkHourFormat`

This method checks if a given double value represents a valid hour format.

```java
public static void checkHourFormat(double hour) throws NumberFormatException
```

- `hour`: The double value to be validated.
- Throws a `NumberFormatException` if the input is not a valid hour format in the "H.i" format.

### `sumHours`

This method takes an array of hours and returns their sum in the "HH.MM" format.

```java
public static String sumHours(double[] hoursArray)
```

- `hoursArray`: An array of double values representing hours.
- Returns the total sum of hours and minutes in the "HH.MM" format.

### `multiplyHour`

This method multiplies a given hour by a specified number and returns the result in the "HH.MM" format.

```java
public static String multiplyHour(double hour, double number)
```

- `hour`: The initial hour value.
- `number`: The multiplier.
- Returns the result of multiplying the hour by the number in the "HH.MM" format.

### `flattenHours`

This method converts a decimal number of hours to a simplified format.

```java
public static double flattenHours(double hour)
```

- `hour`: The decimal number of hours.
- Returns a simplified, rounded double value representing the hours.

## Usage

Here's how you can use the `HoursUtils` class in your Java program:

```java
import com.shadhin.HoursUtils;

public class Main {
    public static void main(String[] args) {
        try {
            double[] hoursArray = {8.5, 7.25, 6.75};
            
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
```

This program demonstrates how to use the methods provided by `HoursUtils` for hour format validation, summing hours, multiplying hours, and flattening hours.
