package com.techelevator.Options;


import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;


public class MoneyManager {
    public BigDecimal moneyAmountTotal = new BigDecimal("0.00");
    public BigDecimal moneyAmountCurrent = new BigDecimal("0.00");

    public void addMoneyAmount(int amountGetting) {
        BigDecimal tenBill = new BigDecimal("10.00");
        BigDecimal fiveBill = new BigDecimal("5.00");
        BigDecimal twentyBill = new BigDecimal("20.00");
        BigDecimal dollarBill = new BigDecimal("1.00");
        UserOutput input = new UserOutput();

        try {
             BigDecimal maxAmount = new BigDecimal ("50.0");

            while (moneyAmountTotal.compareTo(maxAmount) < 0) {

                if (amountGetting == 1) {
                   moneyAmountTotal = moneyAmountCurrent.add(dollarBill);
                    System.out.println("Your current total is : " + moneyAmountTotal);
                } else if (amountGetting == 5) {
                    moneyAmountTotal = moneyAmountTotal.add(fiveBill);
                    System.out.println("Your current total is : " + moneyAmountTotal);
                } else if (amountGetting == 10) {
                    moneyAmountTotal = moneyAmountTotal.add(tenBill);
                    System.out.println("Your current total is : " +  moneyAmountTotal);
                } else if (amountGetting == 20) {
                    moneyAmountTotal = moneyAmountTotal.add(twentyBill);
                    System.out.println("Your current total is : " + moneyAmountTotal);

                } else {
                    System.out.println("Maximum money entered. >:( ");
                }
                moneyAmountCurrent = moneyAmountTotal;
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public BigDecimal resetVendingMachine () {
            BigDecimal quarter = new BigDecimal("0.25");
            BigDecimal dime = new BigDecimal("0.10");
            BigDecimal nickel = new BigDecimal("0.05");
            BigDecimal dollar = new BigDecimal("1.00");
            BigDecimal moneyAmount = this.moneyAmountTotal;
            int dollarCounter = 0;
            int quarterCounter = 0;
            int dimeCounter = 0;
            int nickelCounter = 0;

            while (moneyAmount.compareTo(BigDecimal.ZERO) > 0) {

                if (moneyAmount.compareTo(dollar) > 0) {
                    moneyAmount = moneyAmount.subtract(dollar);
                    dollarCounter++;

                } else if (moneyAmount.compareTo(BigDecimal.valueOf(0.99)) < 0 && moneyAmount.compareTo(quarter) >= 0) {
                    moneyAmount = moneyAmount.subtract(quarter);
                    quarterCounter++;

                } else if (moneyAmount.compareTo(quarter) < 0 && moneyAmount.compareTo(dime) >= 0) {
                    moneyAmount = moneyAmount.subtract(dime);
                    dimeCounter++;

                } else if (moneyAmount.compareTo(dime) < 0 && moneyAmount.compareTo(nickel) >= 0) {
                    moneyAmount = moneyAmount.subtract(nickel);
                    nickelCounter++;
                }
            }
            System.out.println(dollarCounter + quarterCounter + dimeCounter + nickelCounter);
        return moneyAmount;
    }
}
