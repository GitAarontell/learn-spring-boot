package com.in28minutes.springboot.learnspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// ctrl shift o for automatic imports ctrl = cmd
@RestController
public class CurrencyConfigurationController {
		
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration CurrencyServiceCongfiguration() {

		return configuration;
	}
}
