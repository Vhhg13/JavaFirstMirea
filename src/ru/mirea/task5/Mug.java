package ru.mirea.task5;

public class Mug extends Dish{

    public Mug(String color, String material){
        this.color=color;
        this.material=material;
    }
    @Override
    public void fill(String obj) {
        System.out.format("You pour some %s into the mug\n", obj);
        contents=obj;
    }

    @Override
    public void empty() {
        System.out.format("You pour the %s out from the mug\n", contents);
        contents=null;
    }

    @Override
    public void consumeContents(){
        System.out.format("You drink %s from the mug\n", contents);
        contents=null;
    }
    public String toString(){
        return color+" "+material+" mug";
    }
}
