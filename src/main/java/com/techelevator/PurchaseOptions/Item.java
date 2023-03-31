package com.techelevator.PurchaseOptions;

import java.math.BigDecimal;

public class Item {

        private String name;
        private BigDecimal price;
        private int quantity = 6;
        private String slotNumber;
        private String type;



        public void Item(String name, BigDecimal price, String slotNumber, String type) {
            this.name = name;

            this.price = price;

            this.slotNumber = slotNumber;

            this.type = type;
        }

    public String getType() {
        return type;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
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


}

