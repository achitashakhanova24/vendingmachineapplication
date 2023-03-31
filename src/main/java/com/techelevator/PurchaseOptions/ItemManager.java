package com.techelevator.PurchaseOptions;

//TODO: list all items w/ what user types to get it, return to purchase menu
// (out of stock/doesnt exist (CATCHES?), dispenses item (remove one from stock),
// print out item name/message, updates balance in machine (feed money),
// BOGODO sale (second item purchased/very item (%2==0) is $1 off)
// print out not enough money if over amount in machine (total >feed money),
// return to main menu (Finish transaction inside the select item)

import com.techelevator.MenuOptions.VendingItems;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.util.List;
import java.util.Scanner;

//new itemmanager() pass in new item
//item manager is the one who has control of items and what will be displayed and such
public class ItemManager {


   private List<VendingItems> item;
    public void addItem (){
        private List<VendingItems> item;
       item =  VendingItems new item();
        display(item);
    }




    public void exit () {
        UserOutput.exit();
    }
}
