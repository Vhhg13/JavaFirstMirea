package ru.mirea.task5;

public class GShepherd extends Dog{
    public GShepherd(String name){
        this.name=name;
        color="black";
    }

    @Override
    public String getBreed() {
        return "german shepherd";
    }

    @Override
    public void play() {
        System.out.println("You play with your shepherd");
    }
}
