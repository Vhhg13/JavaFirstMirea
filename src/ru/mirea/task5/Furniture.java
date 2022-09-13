package ru.mirea.task5;

public abstract class Furniture {
    protected String material;
    protected String color;
    protected double price;

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected Furniture(String material, String color){
        this.material=material;
        this.color=color;
    }

    public abstract void testOut();
}
