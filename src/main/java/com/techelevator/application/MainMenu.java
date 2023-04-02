package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {


    public void run() throws IOException {
        UserInput userInput = new UserInput();
         String option = UserInput.getMenuOptions();
        while (!option.equals("e")) {
            UserOutput.displayMainMenu();
            if (option.equals("d")) {

                File itemFile = new File("C:\\Users\\Student\\workspace\\java-orange-minicapstonemodule1-team1\\catering.csv");
                    try {
                        Scanner scanner = new Scanner(itemFile);
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            System.out.println(line);
                        }
                    } catch(
                    FileNotFoundException e)

                    {
                        e.printStackTrace();
                    }

            }
            if (option.equals ("p")){
                UserOutput.displayPurchaseMenu();
            }
        }
    }
}
