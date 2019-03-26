package org.atakan.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class WeatherInfoMain {

	private float temp;
	private float pressure;
	private float humidity;
	private float temp_min;
	private float temp_max;
	
	public WeatherInfoMain() {}

	public WeatherInfoMain(float temp, float pressure, float humidity, float temp_min, float temp_max) {
		super();
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}

	public float getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	
	
	
}
