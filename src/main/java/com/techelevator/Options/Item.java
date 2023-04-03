package com.techelevator.Options;

import java.math.BigDecimal;

public class Item {

        private String name;
        private BigDecimal price;
        private int quantity;
        private String slotNumber;
        private String type;

        public Item(String name, BigDecimal price, String slotNumber, String type) {
            this.name = name;

            this.price = price;

            this.slotNumber = slotNumber;

            this.type = type;

            this.quantity = 5;
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

    @Override
    public String toString(){
        if (quantity < 1) {
            return slotNumber + ": " + name + "SOLD OUT";
        }
        return slotNumber + ": " + name + " - " + getPrice() + " - " + quantity + " remaining";
    }

    public void inventoryDecrement() {
       quantity --;
    }
}

