package ru.mirea.task5;

public class Table extends Furniture{
    public Table(String material, String color){
        super(material, color);
    }

    @Override
    public void testOut() {
        System.out.format("You sit on a %s %s table.\n", color, material);
    }
}
