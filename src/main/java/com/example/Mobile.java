package com.example;

public class Mobile {
    int  id;
    String brand;
    String model;
    int stock;
    double price;

    public Mobile(int id, String brand, String model, int stock, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
