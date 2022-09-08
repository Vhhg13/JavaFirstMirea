package ru.mirea.task3;

public class Brain {
    public void workOn(Object object){
        System.out.format("Мозг думает над объектом [%s]\n", object);
    }
    public String toString(){
        return "Мозг №"+System.identityHashCode(this);
    }
}
