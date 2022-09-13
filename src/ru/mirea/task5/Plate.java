package ru.mirea.task5;

public class Plate extends Dish{

    public Plate(String color, String material){
        this.color=color;
        this.material=material;
    }
    @Override
    public void fill(String obj) {
        System.out.format("You put %s into the plate\n", obj);
        contents=obj;
    }

    @Override
    public void empty() {
        System.out.format("You threw %s out from the plate\n", contents);
        contents=null;
    }
    @Override
    public void consumeContents(){
        System.out.format("You have eaten %s off the plate\n", contents);
        contents=null;
    }
    public String toString(){
        return color+" "+material+" plate";
    }
}
