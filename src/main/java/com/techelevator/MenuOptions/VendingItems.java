package com.techelevator.MenuOptions;

import java.math.BigDecimal;
import java.util.List;
//display();
//private chips, munchies, soda,gum
//this will display item manager

public class VendingItems {
    private String items;
    private BigDecimal amount;
    private int slot;

    public VendingItems(String items, BigDecimal amount, int slot) {
        this.items = items;
        this.amount = amount;
        this.slot = slot;

    }

    public String getItems() {

        return items;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getSlot() {
        return slot;
    }
}


