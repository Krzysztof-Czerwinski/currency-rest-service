package com.exchangeRate.restservice;

import java.math.BigDecimal;

public class Currency {
    private String currencySymbol;
    private BigDecimal convertedValue;

    public Currency(String currencySymbol, BigDecimal convertedValue) {
        this.currencySymbol = currencySymbol;
        this.convertedValue = convertedValue;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

}
