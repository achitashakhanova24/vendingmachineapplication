package com.techelevator.PurchaseOptions;


import java.math.BigDecimal;


public class MoneyManager {
    private BigDecimal amount;
    private BigDecimal currentMoneyProvided = BigDecimal.ZERO;
    private BigDecimal currentBalance;

    public MoneyManager(BigDecimal amount) {
        this.amount = amount;
        this.currentMoneyProvided = BigDecimal.ZERO;
        this.currentBalance = BigDecimal.ZERO;
    }

    public BigDecimal addCurrentMoneyProvided(BigDecimal amountInserted) {
        currentMoneyProvided = currentMoneyProvided.add(amountInserted);
        return currentMoneyProvided;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public BigDecimal returnChange(BigDecimal currentMoneyProvided, BigDecimal itemTotal) {

        BigDecimal quarter = new BigDecimal("0.25"); // BigDecimal?
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");
        BigDecimal penny = new BigDecimal("0.01");
        BigDecimal dollar = new BigDecimal("1.00");
       // BigDecimal //currentMoneyProvided = this.currentMoneyProvided;
        BigDecimal change = currentMoneyProvided.subtract(itemTotal);
        return change;


              }
          }
