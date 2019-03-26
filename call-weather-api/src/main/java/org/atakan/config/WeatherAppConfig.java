package org.atakan.config;

import org.atakan.service.WeatherAPIService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.atakan")
public class WeatherAppConfig {

	@Bean 
	public WeatherAPIService weatherAPIService() {
		return new WeatherAPIService();
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/view/");
		irvr.setSuffix(".jsp");
		
		return irvr;	
	}
}
