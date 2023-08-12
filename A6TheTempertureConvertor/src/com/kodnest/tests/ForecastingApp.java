package com.kodnest.tests;

public class ForecastingApp {

	public static void main(String[] args) 
	{	
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double res=temperatureConverter.convertFahrenheitToCelsius(68.0);
		System.out.println(res);
	}

}
class TemperatureConverter {

public double convertFahrenheitToCelsius(double F)
{
	return (F - 32) * 5/9;
}

}