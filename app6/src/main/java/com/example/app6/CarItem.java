package com.example.app6;
public class CarItem {
    private String price;
    private String brand;
    private String year;
    private int imageResource;

    public CarItem(String price, String brand, String year, int imageResource) {
        this.price = price;
        this.brand = brand;
        this.year = year;
        this.imageResource = imageResource;
    }

    public String getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public int getImageResource() {
        return imageResource;
    }
}
