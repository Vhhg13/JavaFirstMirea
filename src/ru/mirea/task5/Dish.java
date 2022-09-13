package ru.mirea.task5;

public abstract class Dish {
    protected String color;
    protected String material;
    protected String contents;

    public abstract void fill(String obj);
    public abstract void empty();
    public abstract void consumeContents();
    public String getContents(){
        return contents;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }


}
