package org.sid.billingservice1.model;
import lombok.Data;

@Data
public class Product {
    private  Long id;
    private String name;
    private String email;

    public double Price() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
