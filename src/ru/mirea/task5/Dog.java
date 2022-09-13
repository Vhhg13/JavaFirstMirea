package ru.mirea.task5;

public abstract class Dog {
    protected String name;
    protected String color;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public abstract String getBreed();
    public abstract void play();
}
