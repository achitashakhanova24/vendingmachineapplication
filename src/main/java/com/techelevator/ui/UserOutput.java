package com.techelevator.ui;

import com.techelevator.PurchaseOptions.MoneyManager;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println(" Welcome! ");
    }

    public static void displayPurchaseMenu() {
        MoneyManager moneyManager = new MoneyManager();
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");

        System.out.println();
        System.out.print("Please select an option: ");
        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        if (option.equals ("m")){
            System.out.println("Please enter an amount ");
                String optionPicked = scanner.nextLine();
                BigDecimal feedMoney =  BigDecimal.valueOf(Long.parseLong(optionPicked));
                moneyManager.addCurrentMoneyProvided(feedMoney);

        }
        if (option.equals ("s")){

        }

    }
}