package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;


public class MainMenu {
    public static final int MAIN_MENU = 0;
    public static final int EXIT = 1;
    public static final int VENDING_ITEMS = 2;
    public static final int PURCHASES_MENU = 3;

    public void run() {
        int vendingMachineState = MAIN_MENU;


        while (vendingMachineState != EXIT) {

            if (vendingMachineState == MAIN_MENU) {

                UserOutput.displayVendingMachine();
                UserInput.getHomeScreenOption();

            } else if (vendingMachineState == VENDING_ITEMS) {


            } else if (vendingMachineState == PURCHASES_MENU) {


            }
        }

        exit();
    }

    public void exit() {
        UserOutput.exit();
    }
}