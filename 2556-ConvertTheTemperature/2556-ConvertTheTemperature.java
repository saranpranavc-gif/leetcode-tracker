// Last updated: 09/07/2026, 09:46:13
public class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15; // Convert to Kelvin
        double fahrenheit = celsius * 9 / 5 + 32; // Convert to Fahrenheit
        return new double[] {kelvin, fahrenheit}; // Return Kelvin first, then Fahrenheit
    }
}
