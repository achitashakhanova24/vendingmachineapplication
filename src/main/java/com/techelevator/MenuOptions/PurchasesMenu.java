package com.techelevator.MenuOptions;

//TODO: make menu that leads user to three options, accept user input for the options
// scanner(reader and writer(?)) for audit.txt

import com.techelevator.PurchaseOptions.Item;
import com.techelevator.PurchaseOptions.ItemManager;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import static com.techelevator.application.MainMenu.EXIT;
import static jdk.internal.org.jline.keymap.KeyMap.display;

public class PurchasesMenu {
        public static final int PURCHASE_MENU= 0;
        public static final int  MONEY_MANAGER= 1;
        public static final int ITEM_MANAGER = 2;

    int purchaseState = PURCHASE_MENU;

    {
        while (purchaseState != EXIT) {

            if (purchaseState == PURCHASE_MENU) {

                UserOutput.displayPurchaseMenu();
                purchaseState = UserInput.getMenuOptions();

            } else if (purchaseState == MONEY_MANAGER) {


            }

        } else if (purchaseState == ITEM_MANAGER) {


    }
    }
}
