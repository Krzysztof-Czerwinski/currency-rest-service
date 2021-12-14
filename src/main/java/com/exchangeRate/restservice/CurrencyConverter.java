package com.exchangeRate.restservice;

import java.math.BigDecimal;

public class CurrencyConverter {

    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal exchangeRate;
    private BigDecimal convertedAmount;

    public CurrencyConverter(String from, String to, BigDecimal quantity,
                             BigDecimal exchangeRate, BigDecimal convertedAmount) {
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.exchangeRate = exchangeRate;
        this.convertedAmount = convertedAmount;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }


}
