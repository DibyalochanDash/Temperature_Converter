package Task_1;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            try {
                System.out.print("Enter temperature value: ");
                double temperature = sc.nextDouble();

                System.out.print("Enter unit of measurement (C or F): ");
                char unit = sc.next().charAt(0);

                if (unit == 'C' || unit == 'c') {
                    double convertedTemperature = celsiusToFahrenheit(temperature);
                    System.out.println("Converted temperature: " + convertedTemperature + " °F");
                } else if (unit == 'F' || unit == 'f') {
                    double convertedTemperature = fahrenheitToCelsius(temperature);
                    System.out.println("Converted temperature: " + convertedTemperature + " °C");
                } else {
                    System.out.println("Invalid unit of measurement. Please enter C or F.");
                }

                System.out.print("Do you want to convert another temperature? (yes/no): ");
                String choice = sc.next().toLowerCase();

                if (!choice.equals("yes")) {
                    isRunning = false;
                }
            } catch (Exception e) { // Catch the Exception
                System.out.println("Please insert a Valid Input!");
                sc.nextLine();
            }
        }

        System.out.println("Thank you for using the Temperature Converter!");
        sc.close();
    }

    // Convert Celsius to Fahrenheit Method
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius Method
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}


