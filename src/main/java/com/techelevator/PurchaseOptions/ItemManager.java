package com.techelevator.PurchaseOptions;

//TODO: list all items w/ what user types to get it, return to purchase menu
// (out of stock/doesnt exist (CATCHES?), dispenses item (remove one from stock),
// print out item name/message, updates balance in machine (feed money),
// BOGODO sale (second item purchased/very item (%2==0) is $1 off)
// print out not enough money if over amount in machine (total >feed money),
// return to main menu (Finish transaction inside the select item)

import com.techelevator.MenuOptions.VendingItems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManager {
    //new itemmanager() pass in new item
    //item manager is the one who has control of items and what will be displayed and such
    private List<VendingItems> items;

    public ItemManager(List<VendingItems> items) {

        this.items = new ArrayList<>();
    }

    public void addItem(VendingItems item) {
        this.items.add(item);
    }

    //adding readCsvFile() to use scanner
    private void readCsvFile() throws FileNotFoundException {

        File file = new File("catering.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineOfData = line.split(",");
                //missing something here:
            }
        }
    }


}

