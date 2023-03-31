package com.techelevator.MenuOptions;


import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import static com.techelevator.application.MainMenu.EXIT;

public class PurchasesMenu {
    public static final int PURCHASE_MENU = 0;
    public static final int MONEY_MANAGER = 1;
    public static final int ITEM_MANAGER = 2;

    int purchaseState = PURCHASE_MENU;

    {
        while (purchaseState != EXIT) {

            if (purchaseState == PURCHASE_MENU) {

                UserOutput.displayPurchaseMenu();
                purchaseState = UserInput.getMenuOptions();

            } else if (purchaseState == MONEY_MANAGER) {


            } else if (purchaseState == ITEM_MANAGER) {


            }
        }
    }
}
