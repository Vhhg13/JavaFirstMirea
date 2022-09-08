package ru.mirea.task3;

public class Head {
    private Brain brain;
    public Head(){
        brain=new Brain();
    }
    public Brain getBrain(){
        return brain;
    }
    public String toString(){
        return "Голова №"+System.identityHashCode(this);
    }
}
