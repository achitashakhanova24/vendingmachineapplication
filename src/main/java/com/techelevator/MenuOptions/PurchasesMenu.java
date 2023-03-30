package com.techelevator.MenuOptions;

//TODO: make menu that leads user to three options, accept user input for the options
// scanner(reader and writer(?)) for audit.txt

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class PurchasesMenu {
    {
        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("FeedMoney"))
            {
                // display the vending machine slots
            }
            else if(choice.equals("SelectItem"))
            {
                // make a purchase
            }
            else if(choice.equals("FinishTransaction"))
            {
                // good bye
                break;
            }
        }
    }
}
