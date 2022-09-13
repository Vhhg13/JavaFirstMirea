package ru.mirea.task5;

public class Chair extends Furniture{
    public Chair(String material, String color){
        super(material, color);
    }

    @Override
    public void testOut() {
        System.out.format("You sit on a %s %s chair.\n", color, material);
    }
}
