package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args){
        Human h1=new Human();
        Brain obj1=new Brain();
        h1.kick(obj1);

        System.out.println();

        h1.setLeadingHand("left");
        Object obj2=new Object();
        h1.throwAn(obj2);

        System.out.println();

        h1.thinkAbout(obj1);
    }
}
