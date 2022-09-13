package ru.mirea.task5;

public class Corgi extends Dog{
    public Corgi(String name){
        this.name=name;
        color="yellow";
    }

    @Override
    public String getBreed() {
        return "corgi";
    }

    @Override
    public void play(){
        System.out.println("You play with your corgi");
    }
}
