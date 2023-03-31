package com.techelevator.PurchaseOptions;

import com.techelevator.MenuOptions.VendingItems;
import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;
import java.util.List;

public class Item {

        private String name;
        private BigDecimal price;
        private int quantity = 6;
        private String slotNumber;
        private String type;

        public Item(String name, BigDecimal price, String slotNumber, String type) {
            this.name = name;

            this.price = price;

            this.slotNumber = slotNumber;

            this.type = type;
        }



        public Item(String name, BigDecimal price, int quantity, String slotNumber, String type) {
            this.name = name;
            this.price = price;
            this.slotNumber = slotNumber;
            this.type = type;

        }


        public String getName() {

            return name;
        }

        public BigDecimal getPrice() {

            return price;
        }

        public String getSlotNumber() {

            return slotNumber;
        }


        public String getType() {

            return type;
        }


        public int getQuantity() {

            return quantity;
        }

        public void setQuantity(int quantity) {

            this.quantity = quantity;
        }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
    public
      List<VendingItems> Item;
     UserOutput.displayItem()


}

