package com.example.ltddlab5a;

public class Food {
    private String name;
    private String detail;
    private String price;
    private int imageFood;

    public Food(String name, String detail, String price, int imageFood) {
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.imageFood = imageFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageFood() {
        return imageFood;
    }

    public void setImageFood(int imageFood) {
        this.imageFood = imageFood;
    }
}
