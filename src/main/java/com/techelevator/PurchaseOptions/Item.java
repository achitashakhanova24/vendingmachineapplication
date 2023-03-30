package com.techelevator.PurchaseOptions;

import java.math.BigDecimal;

public class Item {
    public class ItemManager {
        private String name;
        private BigDecimal price;
        private int quantity = 6;
        //type
        //slot number



        public void Item(String name, BigDecimal price) {
            this.name = name;

            this.price = price;
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
    }

}
