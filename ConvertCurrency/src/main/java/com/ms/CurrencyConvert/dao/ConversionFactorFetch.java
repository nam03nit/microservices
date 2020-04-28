package com.ms.CurrencyConvert.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ms.CurrencyConvert.domain.ConversionFactor;

@FeignClient("http://localhost:9090/")
public interface ConversionFactorFetch {
		
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public ConversionFactor getConversionFactor(@RequestParam(value="countryCode") String countryCode);
	
	
}
