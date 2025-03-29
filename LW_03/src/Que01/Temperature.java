package Que01;

import java.util.Scanner;

class Temp {
    private double celsius;

    public Temp() {
        this.celsius = 0.0;
    }
    public Temp(double celsius) {
        this.celsius = celsius;
    }
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
    public double toCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = scanner.nextDouble();

        Temp temp = new Temp(celsiusInput);
        System.out.println("Equivalent Fahrenheit: " + temp.toFahrenheit());

        scanner.close();
    }
}
