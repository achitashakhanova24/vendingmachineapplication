package com.techelevator;

import com.techelevator.application.MainMenu;

import java.io.FileNotFoundException;
import java.io.IOException;

public class VendingMachineCLI 
{
    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.run();
    }
    
}
