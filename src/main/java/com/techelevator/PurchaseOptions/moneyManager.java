package com.techelevator.PurchaseOptions;

 //TODO:needs to be able to subtract money


import java.math.BigDecimal;

public class moneyManager {
        private final BigDecimal amount;
        private BigDecimal currentMoneyProvided = BigDecimal.ZERO;

        public moneyManager(BigDecimal amount) {
            this.amount = new BigDecimal(String.valueOf((amount)));
        }

        public BigDecimal getCurrentMoneyProvided (BigDecimal amountInserted) {
        currentMoneyProvided = currentMoneyProvided.add(amountInserted);
        return currentMoneyProvided;
        public BigDecimal getchange(BigDecimal amountReturned)
        currentMoneyProvided = currentMoneyProvided.subtract(amountReturned);
    }

}


//void feedMoney(bigdecimal amounttoadd){}
//void deductmoney (){}
//primary things are money and items
//one money variable that is in here and other classes use this one