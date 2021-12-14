package com.exchangeRate.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConverterService {

    CurrencyController convertion1 = new CurrencyController();
@GetMapping("currency/from/{from}/to/{to}/{quantity}")
    public CurrencyConverter getDetails(@PathVariable("from") String from,
                                        @PathVariable("to") String to,
                                        @PathVariable("quantity") BigDecimal quantity)
    {
        if(from.contains("PLN") && to.contains("EUR"))
        {
            return new CurrencyConverter(from, to, quantity,
                    convertion1.eur.getConvertedValue(), quantity.multiply(convertion1.eur.getConvertedValue()));

        }
        else if(from.contains("PLN") && to.contains("USD"))
        {
            return new CurrencyConverter(from, to, quantity,
                    convertion1.usd.getConvertedValue(), quantity.multiply(convertion1.usd.getConvertedValue()));

        }
        else if(from.contains("PLN") && to.contains("JPY"))
        {
            return new CurrencyConverter(from, to, quantity,
                    convertion1.jpy.getConvertedValue(), quantity.multiply(convertion1.jpy.getConvertedValue()));

        }
        else if(from.contains("PLN") && to.contains("GBP"))
        {
            return new CurrencyConverter(from, to, quantity,
                    convertion1.gbp.getConvertedValue(), quantity.multiply(convertion1.gbp.getConvertedValue()));

        }
        else if(from.contains("PLN") && to.contains("NOK"))
        {
            return new CurrencyConverter(from, to, quantity,
                    convertion1.nok.getConvertedValue(), quantity.multiply(convertion1.nok.getConvertedValue()));

        }
        else


        return new CurrencyConverter("nieobsługiwany przypadek", "nieobsługiwany przypadek", quantity,
                BigDecimal.valueOf(4), quantity.multiply(BigDecimal.valueOf(4)));
    }
}
