package com.techelevator.ui;

import com.techelevator.PurchaseOptions.ItemManager;
import com.techelevator.PurchaseOptions.MoneyManager;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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

    public static void displayPurchaseMenu() throws IOException {
        MoneyManager moneyManager = new MoneyManager();
        UserInput input = new UserInput();

        System.out.println("What would you like to do? ");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");
        System.out.println("F) Finish Transaction");

        System.out.println();
        System.out.print("Please select an option: ");
        String selectOption = scanner.nextLine();
        String optionPurchase = selectOption.trim().toLowerCase();

        if (optionPurchase.equals("m")) {
            System.out.println("Please insert $1, $5, $10, or $20: ");
            System.out.println("Current money is: " + moneyManager.addMoneyAmount());

        }

        if (optionPurchase.equals("s")) {
            System.out.print("Welcome!");

            ItemManager itemManager = new ItemManager();
            itemManager.readreadCsvFile();
            System.out.print("Please make your selection: ");
            String pickedOption = scanner.nextLine();
            String selection = pickedOption.trim().toLowerCase();
            if (selection.contains("munchy")) {
                System.out.println(selection + " dispensed! ʕ •ᴥ•ʔ <" +"Munchy, Munchy, so Good!");
            }
            if (selection.contains("candy")) {
                System.out.println(selection + " dispensed! ʕ •ᴥ•ʔ <" +"Sugar, Sugar, so Sweet!");
            }
            if (selection.contains("drink")) {
                System.out.println(selection + " dispensed! ʕ •ᴥ•ʔ <" +"Drinky, Drinky, Slurp Slurp!");
            }
            if (selection.contains("gum")) {
                System.out.println( selection + " dispensed! ʕ •ᴥ•ʔ <" + "Chewy, Chewy, Lots O Bubbles!");
            }

            try (PrintWriter fileWriter = new PrintWriter("C:\\Users\\Student\\workspace\\java-orange-minicapstonemodule1-team1\\Audit.txt")) {
                LocalDateTime now = LocalDateTime.now();
                fileWriter.println(now + " " + selection);
            }

        }
        if (optionPurchase.equals("f")) {
            System.out.println("After a while crocodile! ~~~^,^,^*<");
            System.out.println("Here is your change: ");
            moneyManager.resetVendingMachine();
        }
    }

    public static BigDecimal addAmount() {
        MoneyManager moneyManager = new MoneyManager();
        System.out.println("Please insert $1, $5, $10, or $20: ");
        String optionPicked = scanner.nextLine();
        BigDecimal amountInserted = new BigDecimal(optionPicked);
        return amountInserted;
    }
}
//BOGODO sale if item %2 == 0, 1 dollar off (every second item)