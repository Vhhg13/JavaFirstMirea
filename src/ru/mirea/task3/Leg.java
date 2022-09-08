package ru.mirea.task3;

public class Leg {
    private String right_left;
    public Leg(){
        right_left="Правая";
    }
    public Leg(String rl){
        right_left=rl;
    }
    public void accelerate(){
        System.out.format("%s нога двигается\n", right_left);
    }
    public void hit(Object obj){
        System.out.format("%s нога попала по объекту [%s]\n", right_left, obj);
    }

    public String toString() {
        return "Нога №"+System.identityHashCode(this);
    }
}
