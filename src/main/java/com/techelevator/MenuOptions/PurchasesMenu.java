package com.techelevator.MenuOptions;

//TODO: make menu that leads user to three options, accept user input for the options
// scanner(reader and writer(?)) for audit.txt

import com.techelevator.PurchaseOptions.Item;
import com.techelevator.PurchaseOptions.ItemManager;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.IOException;
import java.util.Scanner;

import static com.techelevator.application.MainMenu.EXIT;
import static com.techelevator.ui.UserInput.getPurchaseMenuOption;
import static jdk.internal.org.jline.keymap.KeyMap.display;

public class PurchasesMenu {
    // here we are defining constants for our menu options
    public static final int PURCHASE_MENU = 0;
    public static final int FEED_MONEY = 1;
    public static final int SELECT_ITEM = 2;

   // creating Scanner to read the user input
    private Scanner scanner = new Scanner(System.in);
    //an instance of the ItemManager to manage the items
    private ItemManager itemManager = new ItemManager();

    public void run() throws IOException {
        //setting the in.state for the purchase menu
        int purchaseState = PURCHASE_MENU;
        //loop till they choose to exit
        while (purchaseState != EXIT){
            //displaying the appropriate menu based on its state
      if(purchaseState == PURCHASE_MENU){
        UserOutput.displayPurchaseMenu();
        //read user's menu choice and update the state
        UserInput.getPurchaseMenuOption();
    } else if(purchaseState == FEED_MONEY){
        //TODO: we have to implement money manager functionality?
    } else if(purchaseState == SELECT_ITEM){
    //TODO: implement money manager functionality?
          // running the item manager to keep reading the user input
                itemManager.run(scanner);
            }
            purchaseState= PURCHASE_MENU;
            }
        //don't forget to close the scanner when the loop is still going :D
        scanner.close();
    }

}