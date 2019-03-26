package org.atakan.service;

import org.atakan.entity.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource({"classpath:api.properties"})
public class WeatherAPIService {

	
	@Autowired
	Environment env;
	
	RestTemplate restTemplate = new RestTemplate();
		
	private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=";
	private static final String urllast="&units=metric";
	
	public WeatherInfo getWeather(String city) {
		
		System.out.println(url+city+urllast+"&APPID="+env.getProperty("API_KEY"));
		WeatherInfo weatherInfo = restTemplate.getForObject(url+city+urllast+"&APPID="+env.getProperty("API_KEY"),WeatherInfo.class);

		System.out.println(weatherInfo);

		
		
		return weatherInfo;
	}
	
	
}
