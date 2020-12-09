package com.serrodcal.application.dto;

public class TransactionResultDTO {

    private Boolean result;
    private Double balance;
    private String currency;

    public TransactionResultDTO(Boolean result, Double balance, String currency) {
        this.result = result;
        this.balance = balance;
        this.currency = currency;
    }

    public Boolean getResult() {
        return result;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

}
