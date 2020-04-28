package com.ms.ConvertCurrency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.CurrencyConvert.dao.ConversionFactorFetch;
import com.ms.CurrencyConvert.domain.ConversionFactor;




@Service()
public class ConvertCurrencyServiceImp implements ConvertCurrencyService{

	
	public ConversionFactorFetch conversionFactorFetch;

	public double getAmount(double amount, String countryCode) {
		ConversionFactor conversionFactor = conversionFactorFetch.getConversionFactor(countryCode);
		double cf = conversionFactor.getConversionFactor();
		double convertedAmount = amount*cf;
		return convertedAmount;
	}
	
	@Autowired
	public void setconversionFactorFetch(ConversionFactorFetch conversionFactorFetch) {
		this.conversionFactorFetch = conversionFactorFetch;
	}

}
