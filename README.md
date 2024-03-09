# Java Vending Machine Application

## Overview

The Java Vending Machine application provides a user-friendly simulation of a vending machine, allowing users to view available items, make purchases, and manage transactions. This project leverages Java for backend functionality and includes features such as a main menu, purchase menu, and robust management classes.

## Features

### Main Menu

1. **Display Vending Machine Items (Option D):** View the list of available items within the vending machine.
2. **Purchase (Option P):** Access the purchase menu to feed money, select items, and complete transactions.
3. **Exit (Option E):** Quit the application.

### Purchase Menu

- **Feed Money (Option M):** Insert $1, $5, $10, or $20 bills into the vending machine.
- **Select Item (Option S):** Choose from a variety of items, including snacks, candies, drinks, and gums.
- **Finish Transaction (Option F):** Complete the transaction and receive change.

### UserOutput Class
- **The `UserOutput` class manages the display of user interface elements, including the main menu and purchase menu.

```java
UserOutput.displayMainMenu();
UserOutput.displayPurchaseMenu();
UserOutput.addAmount();

### ItemManager Class 
The `ItemManager` class plays a crucial role in managing and providing details about items available in the vending machine. It is responsible for reading item details from a CSV file and offering information for item selection.

### Usage

To utilize the `ItemManager` class, instantiate an object and use the `readCsvFile` method to read item details from the CSV file.

```java
ItemManager itemManager = new ItemManager();
itemManager.readCsvFile();

## Styling

The application incorporates a user-friendly and visually appealing design. The user interface is styled for a modern look, enhancing the overall experience.

## Technologies Used

- Java
- CSV file for item data storage
- Object-oriented programming principles
- File handling for data retrieval
- User interface management

