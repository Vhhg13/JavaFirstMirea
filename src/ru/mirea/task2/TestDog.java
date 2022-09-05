package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args){
        Dog dog1=new Dog("Шарик", 2);
        Dog dog2=new Dog("Мухтар", 7);
        Dog dog3=new Dog();
        dog3.setAge(1);
        System.out.println(dog1);
        dog1.printHumanAge();
        dog2.printHumanAge();
        dog3.printHumanAge();
    }
}
