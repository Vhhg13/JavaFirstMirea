package ru.mirea.task5;

public class Wardrobe extends Furniture{
    public Wardrobe(String material, String color){
        super(material, color);
    }

    @Override
    public void testOut() {
        System.out.format("You sit on a %s %s wardrobe.\n", color, material);
    }
}
