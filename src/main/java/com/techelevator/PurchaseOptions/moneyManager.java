package com.techelevator.PurchaseOptions;

 //TODO:make change/return money (in singles and coins)


public class moneyManager {
        private final double amount;
        double currentMoneyProvided = 0;

        public moneyManager(double amount) {
            this.amount = amount;
        }

        public double getCurrentMoneyProvided(double amountInserted) {

        return currentMoneyProvided += amountInserted;
    }


    //void feedMoney(bigdecimal amounttoadd){}
        //void deductmoney (){}
        //primary things are money and items
        //one money variable that is in here and other classes use this one
}
