package com.techelevator.application;

import com.techelevator.Options.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {


    public void run() throws IOException {
        UserInput userInput = new UserInput();
        List<Item> itemsList = new ArrayList<>();

        String option = "";
        while (!option.equals("e")) {
            UserOutput.displayMainMenu();
            option = userInput.getMenuOptions();
            if (option.equals("d")) {
                try (Scanner fileScanner = new Scanner(new File("catering.csv"))) {
                    while (fileScanner.hasNextLine()) {
                        String currentLine = fileScanner.nextLine();
                        String[] productDetails = currentLine.split("\\,");
                        String slotNumber = productDetails[0];
                        String name = productDetails[1];
                        BigDecimal price = new BigDecimal(productDetails[2]);
                        String type = productDetails[3];
                        itemsList.add(new Item(name, price, slotNumber, type));
                    }
                    for (Item item : itemsList) {
                        System.out.println(item.getSlotNumber() + ", " + item.getName() + ", " + item.getPrice() + ", " + item.getType());
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            if (option.equals("p")) {
                UserOutput.displayPurchaseMenu();
            }
        }
    }
}