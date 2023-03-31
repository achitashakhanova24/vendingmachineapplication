package com.techelevator.ui;

import com.techelevator.PurchaseOptions.ItemManager;
import com.techelevator.PurchaseOptions.MoneyManager;
import com.techelevator.application.MainMenu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("d")) {
//            System.out.println(csv);


        } else if (option.equals("e")) {
            System.out.println("See you later alligator! >*^,^,^~~~");
        }

        return "";
    }

    public static String getPurchaseMenuOption() throws IOException {
        System.out.println("What would you like to do?" +
                "Your current total money is: " + currentMoneyProvided);
        System.out.println();

        System.out.println("M) Feed Money ");
        System.out.println("S) Select item ");
        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("M")) {
            System.out.println("Please enter an amount ");
            String optionPicked = scanner.nextLine();
            String feedMoneyOption = optionPicked.trim().toLowerCase();
            BigDecimal amount = new BigDecimal(feedMoneyOption);


        } else if (option.equals("S")) {
            System.out.println("Your current total money is: " + currentMoneyProvided);

            File file = new File("catering.csv");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] lineOfData = line.split(",");
                    System.out.println(lineOfData);

                    if (item.equals("Munchy")) {
                        System.out.println("Munchy, Munchy, so Good!");
                    }
                    if (item.equals("Candy")) {
                        System.out.println("Sugar, Sugar, so Sweet!");
                    }
                    if (item.equals("Drink")) {
                        System.out.println("Drinky, Drinky, Slurp Slurp!");
                    }
                    if (item.equals("Gum")) {
                        System.out.println("Chewy, Chewy, Lots O Bubbles!");
                    }
                    try {
                        FileWriter writer = new FileWriter("Audit.txt");
                        LocalDateTime now = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss slot   price");
                        writer.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                return "";

            }


            public static int getMenuOptions () {
                return 0;
            }

            public static BigDecimal getUserItemTotal () {
                System.out.println("Please enter your item total:");
                String itemTotalInserted = scanner.nextLine();
                BigDecimal itemTotal = BigDecimal.valueOf(Long.parseLong((itemTotalInserted)));

                return null;
            }
        }

    }
}
