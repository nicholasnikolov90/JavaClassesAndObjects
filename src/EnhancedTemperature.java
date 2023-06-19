
/**
 * @author Nick Nikolov
 * 
 * 
 * Class Name: EnhancedTemperature
 * The class Temperature represents a temperature measurement in units of Fahrenheit
 * and allows for temperature conversion from Fahrenheit to Celsius.
 *
 */

public class EnhancedTemperature {
	
	double degrees;
	
	EnhancedTemperature(double d) {
		this.degrees = d;
	}
	
	//takes the temperature in Fahrenheit and returns it in Fahrenheit
	double getFahrenheit() {
		return this.degrees;
	}
	
	//takes the temperature in Celsius, converts it to Fahrenheit, and returns temp in Fahrenheit
	double getCelsius() {
		return (5 * (this.degrees - 32) / 9);
	}

	public static void main(String[] args) {
		
		Temperature thermometer1 = new Temperature(20);
		Temperature thermometer2 = new Temperature(98.6);
		
		System.out.println("The temperature of thermometer1 is " + thermometer1.getFahrenheit() + " Fahrenheit.");
		System.out.println("The temperature of thermometer1 is " + Math.round(thermometer1.getCelsius()*100)/100.0 + " Celsius.");

		System.out.println("The temperature of thermometer2 is " + thermometer2.getFahrenheit() + " Fahrenheit.");
		System.out.println("The temperature of thermometer2 is " + Math.round(thermometer2.getCelsius()*100)/100.0 + " Celsius.");
	}
}
