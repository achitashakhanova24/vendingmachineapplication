package com.techelevator.MenuOptions;

//TODO: inventory of items, loads initial stock (6), updates quantity as sold, method to list items and details

import java.io.File;
import java.util.Scanner;

import java.math.BigDecimal;

/* TODO :
 - Scanner for the file reading
 - List of all items and prices
 - What items are in stock/out of stock
 - Slot capacity (6)
 -Message that indicates the item is no longer available
 -display item manager read the csv
  */
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


