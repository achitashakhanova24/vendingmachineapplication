package com.techelevator.ui;

import com.techelevator.PurchaseOptions.ItemManager;
import com.techelevator.PurchaseOptions.MoneyManager;
import com.techelevator.application.MainMenu;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput
{
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption()
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("d"))
        {
        }
        else if (option.equals("e"))
        {
        //     MainMenu.EXIT;
        }

        return "";
    }

    public static String getPurchaseMenuOption(){
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money ");
        System.out.println("S) Select item ");
        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("M"))
        {
            System.out.println("Please enter an amount ");
            String optionPicked = scanner.nextLine();
            String feedMoneyOption = optionPicked.trim().toLowerCase();
            BigDecimal amount = new BigDecimal(feedMoneyOption) ;
           // new MoneyManager(amount);
         //   double amount = Double. parseDouble(feedMoneyOption) ;//replace to BigDecimal
         //   new MoneyManager(amount);
        }


        else if (option.equals("S"))
        {

        }

        return "";

    }


    public static int getMenuOptions() {
        return 0;
    }

    public static String messageForItem()

    {
//        if (type.equals("Munchy")) {
//            System.out.println( "Munchy, Munchy, so Good!");
//        }
//        if (type.equals("Candy")) {
//            System.out.println("Sugar, Sugar, so Sweet!");
//        }
//        if (type.equals("Candy")) {
//            System.out.println("Sugar, Sugar, so Sweet!");
//        }
//        if(type.equals("Drink")){
//            System.out.println("Drinky, Drinky, Slurp Slurp!");
//        }
//        if(type.equals("Gum")){
//            System.out.println("Chewy, Chewy, Lots O Bubbles!);
//        }
        return "";
    }
}
