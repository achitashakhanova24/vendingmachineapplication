package com.techelevator.PurchaseOptions;


import com.techelevator.ui.UserInput;

import java.math.BigDecimal;


public class MoneyManager {
    private BigDecimal amount;
    private BigDecimal currentMoneyProvided;
    private BigDecimal currentBalance;


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

//    public BigDecimal returnChange() {
//        BigDecimal itemTotal = UserInput.getUserItemTotal();
//        currentMoneyProvided.subtract(itemTotal);
//        return currentMoneyProvided;
//        return null;
//    }

    public BigDecimal resetVendingMachine() {
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");
        BigDecimal penny = new BigDecimal("0.01");
        BigDecimal dollar = new BigDecimal("1.00");
        BigDecimal currentMoneyProvided = this.currentMoneyProvided;
        while (currentMoneyProvided.compareTo(BigDecimal.ZERO) > 0) {

            if (currentMoneyProvided.compareTo(dollar)> 0) {
                currentMoneyProvided = currentMoneyProvided.subtract(dollar);

            } else if (currentMoneyProvided.compareTo(BigDecimal.valueOf(0.99)) < 0 && currentMoneyProvided.compareTo(quarter) >= 0) {
               currentMoneyProvided = currentMoneyProvided.subtract(quarter);

            } else if (currentMoneyProvided.compareTo(quarter) < 0 && currentMoneyProvided.compareTo(dime) >=0) {
               currentMoneyProvided = currentMoneyProvided.subtract(dime);

            } else if (currentMoneyProvided.compareTo(dime) < 0 && currentMoneyProvided.compareTo(nickel) >= 0) {
                currentMoneyProvided = currentMoneyProvided.subtract(dime);

            } else if (currentMoneyProvided.compareTo(nickel) < 0 && currentMoneyProvided.compareTo(penny) >= 0) {
               currentMoneyProvided = currentMoneyProvided.subtract(penny);
            }
        }
        return currentMoneyProvided;
    }
}
