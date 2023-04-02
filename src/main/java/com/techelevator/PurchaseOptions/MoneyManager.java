package com.techelevator.PurchaseOptions;


import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;


public class MoneyManager {
    public BigDecimal moneyAmount = BigDecimal.ZERO;
    public BigDecimal maxAmount = BigDecimal.valueOf(50.0);

    public BigDecimal addMoneyAmount() {
        BigDecimal tenBill = new BigDecimal(10.00);
        BigDecimal fiveBill = new BigDecimal(5.00);
        BigDecimal twentyBill = new BigDecimal(20.00);
        BigDecimal dollarBill = new BigDecimal(1.00);
        UserOutput input = new UserOutput();
        try {
            while (moneyAmount.compareTo(maxAmount) < 0) {

                if (moneyAmount.compareTo(dollarBill) > 0) {
                   moneyAmount = moneyAmount.add(input.addAmount());

                } else if (moneyAmount.compareTo(BigDecimal.valueOf(1.01)) > 0 && moneyAmount.compareTo(fiveBill) <= 0) {
                    moneyAmount = moneyAmount.add(input.addAmount());

                } else if (moneyAmount.compareTo(BigDecimal.valueOf(5.01)) > 0 && moneyAmount.compareTo(tenBill) <= 0) {
                    moneyAmount = moneyAmount.add(input.addAmount());

                } else if (moneyAmount.compareTo(BigDecimal.valueOf(10.01)) > 0 && moneyAmount.compareTo(twentyBill) <= 0) {
                    moneyAmount = moneyAmount.add(input.addAmount());


                } else if (moneyAmount.compareTo(maxAmount) > 0) {
                    System.out.println("Maximum money entered. >:( ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return moneyAmount;
    }

        public BigDecimal resetVendingMachine () {
            BigDecimal quarter = new BigDecimal("0.25");
            BigDecimal dime = new BigDecimal("0.10");
            BigDecimal nickel = new BigDecimal("0.05");
            BigDecimal dollar = new BigDecimal("1.00");
            BigDecimal moneyAmount = this.moneyAmount;
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
