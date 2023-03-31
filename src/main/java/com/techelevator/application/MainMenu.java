package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import jdk.tools.jmod.Main;

import static com.techelevator.ui.UserOutput.exit;


public class MainMenu {
    public static final int MAIN_MENU = 0;
    public static final int EXIT = 1;
    public static final int VENDING_ITEMS = 2;
    public static final int PURCHASES_MENU = 3;

    public void run() {
        int MainMenuState = MAIN_MENU;

        {
            while (MainMenuState != EXIT) {

                if (MainMenuState == MAIN_MENU) {

                    UserOutput.displayMainMenu();
                    MainMenuState = UserInput.getMenuOptions();

                } else if (MainMenuState == VENDING_ITEMS) {

                    while (MainMenuState != EXIT) {

                        if (MainMenuState == MAIN_MENU) {

                            UserOutput.displayMainMenu();
                            UserInput.getHomeScreenOption();

                        } else if (MainMenuState == VENDING_ITEMS) {


                        } else if (MainMenuState == PURCHASES_MENU) {


                        }
                    }

                    exit();
                }
            }
        }
    }
}