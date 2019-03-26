package org.atakan.controller;

import org.atakan.entity.WeatherInfo;
import org.atakan.service.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/main")
public class WeatherController {

	@Autowired
	WeatherAPIService weatherAPIService;
	
	@GetMapping("/weather")
	public String weather() {
		
	return "weather";	
	}
	
	@PostMapping("/weather/search")
	public String getWeather(@RequestParam("city") String city,RedirectAttributes redirectAttrs) {
		
		WeatherInfo weatherInfo = weatherAPIService.getWeather(city);
		if(weatherInfo!=null) {
		redirectAttrs.addFlashAttribute("weatherInfo",weatherInfo);
		redirectAttrs.addFlashAttribute("city",city);
		}

		return "redirect:/main/weather";
	}
	
	@GetMapping("/weather/search")
	public String getWeatherUrl(@RequestParam("city") String city, Model model) {
		
		WeatherInfo weatherInfo = weatherAPIService.getWeather(city);
		if(weatherInfo!=null) {
		
			model.addAttribute("weatherInfo",weatherInfo);
			
		}
		
		return "weather";
		
	}
	
	
}
