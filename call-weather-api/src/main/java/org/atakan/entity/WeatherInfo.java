package org.atakan.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherInfo {

	@JsonProperty("weather")
	private List<Weather> weather;
	
	@JsonProperty("main")
	private WeatherInfoMain weatherInfoMain;

	public WeatherInfo() {}

	public WeatherInfo(List<Weather> weather, WeatherInfoMain weatherInfoMain) {
		super();
		this.weather = weather;
		this.weatherInfoMain = weatherInfoMain;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public WeatherInfoMain getWeatherInfoMain() {
		return weatherInfoMain;
	}

	public void setWeatherInfoMain(WeatherInfoMain weatherInfoMain) {
		this.weatherInfoMain = weatherInfoMain;
	}

	
	
	
	
	
}
