package ru.mirea.task3;

public class Hand {
    private Object contents;
    private String right_left;

    public Hand(){
        right_left="Правая";
    }
    public Hand(String rl){
        right_left=rl;
    }

    public void pick(Object obj){
        System.out.format("%s рука взяла объект [%s]\n", right_left, obj);
        contents=obj;
    }

    public void accelerate(){
        System.out.format("%s рука двигается\n", right_left);
    }

    public void releaseObject(){
        System.out.format("%s рука выпустила объект [%s]\n", right_left, contents);
        contents=null;
    }
    public String toString(){
        return "Рука №"+System.identityHashCode(this);
    }
}
