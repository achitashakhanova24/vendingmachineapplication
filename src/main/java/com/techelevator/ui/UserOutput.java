package com.techelevator.ui;

import com.techelevator.PurchaseOptions.MoneyManager;

import java.io.File;
import java.io.FileNotFoundException;
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

        if (option.equals("m")) {
            System.out.println("Please enter an amount ");
            String optionPicked = scanner.nextLine();
            BigDecimal feedMoney = BigDecimal.valueOf(Long.parseLong(optionPicked));
            moneyManager.addCurrentMoneyProvided(feedMoney);

            System.out.println("Current Money provided: $" + moneyManager.getCurrentMoneyProvided());
        } else if (option.equals("s")){
            System.out.println("Please enter the item ID: ");
            String itemId= scanner.nextLine();
        }
    }
}

//        }
//        if (option.equals("s")) {
//            System.out.println("Please select an item: ");
//            System.out.println("1) Munchy ($1.50");
//            System.out.println("Enter the item number: ");
//
//            String selectedItemId = scanner.nextLine();
//            String itemId = selectedItemId.trim();
//
//
//            try {
//                File file = new File("C:\\Users\\Student\\workspace\\java-orange-minicapstonemodule1-team1\\catering.csv");
//               Scanner  fileScanner = new Scanner(file);
//
//                while (fileScanner.hasNextLine()) ;
//                String line = fileScanner.nextLine();
//                System.out.println(line);
//

//                if (line[0].equals(itemId)) {
//                    BigDecimal itemPrice = new BigDecimal(line[2]);
//                    if (moneyManager.getCurrentMoneyProvided().compareTo(itemPrice) < 0) {
//                        System.out.println("Sorry, you're broke. lol");
//                    } else {
//                        MoneyManager managerOfMoney = new MoneyManager();
//                        String priceOfItem = scanner.nextLine();
//                        BigDecimal moneyFeed = BigDecimal.valueOf(Long.parseLong(priceOfItem));
//                        managerOfMoney.addCurrentMoneyProvided(moneyFeed);
//
//                   //     managerOfMoney.subtractCurrentMoneyProvided(moneyFeed);
//                    //    System.out.println("Thank you for your purchase.");
//                    }
//                }
//                fileScanner.close();
//            } catch (FileNotFoundException e) {
//
//            }
//        }
//    }
//}
