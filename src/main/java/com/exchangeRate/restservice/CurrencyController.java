package com.exchangeRate.restservice;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

@RestController
public class CurrencyController {
    Random rnd = new Random();
    Currency pln = new Currency("PLN", new BigDecimal(BigInteger.valueOf(100),2));
    Currency usd = new Currency("USD", new BigDecimal(BigInteger.valueOf(rnd.nextInt(1000)+1),2));
    Currency eur = new Currency("EUR", new BigDecimal(BigInteger.valueOf(rnd.nextInt(1000)+1),2));
    Currency jpy = new Currency("JPY", new BigDecimal(BigInteger.valueOf(rnd.nextInt(1000)+1),2));
    Currency gbp = new Currency("GBP", new BigDecimal(BigInteger.valueOf(rnd.nextInt(1000)+1),2));
    Currency nok = new Currency("NOK", new BigDecimal(BigInteger.valueOf(rnd.nextInt(1000)+1),2));

    @GetMapping("/currency")
    public Map<String, BigDecimal> currency() {
        HashMap<String, BigDecimal> currencies = new HashMap<>();
        //currencies.put(pln.getCurrencySymbol(), pln.getConvertedValue());
        currencies.put(usd.getCurrencySymbol(), usd.getConvertedValue());
        currencies.put(eur.getCurrencySymbol(), eur.getConvertedValue());
        currencies.put(jpy.getCurrencySymbol(), jpy.getConvertedValue());
        currencies.put(gbp.getCurrencySymbol(), gbp.getConvertedValue());
        currencies.put(nok.getCurrencySymbol(), nok.getConvertedValue());
        return currencies;
    }
}


