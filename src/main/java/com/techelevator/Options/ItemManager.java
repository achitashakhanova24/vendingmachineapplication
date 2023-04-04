package com.techelevator.Options;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ItemManager {

    private List<Item> items;

    public String readreadCsvFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Student\\workspace\\java-orange-minicapstonemodule1-team1\\catering.csv");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

//            public void addItem (String addedItem){
//                items = items.add(addedItem);
//                return items;
//            }
        }
        return "";
    }
}

//      find item by slot id{
//      pass in slot # gives item and type}
//      print out based on these

