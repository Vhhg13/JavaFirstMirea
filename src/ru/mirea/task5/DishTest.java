package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args){
        Mug mug=new Mug("grey", "metal");
        Plate plate=new Plate("blue", "ceramic");
        mug.fill("milk");
        plate.fill("pasta");
        System.out.format("There is some %s in the %s\n", mug.getContents(), mug);
        System.out.format("There is %s in the %s\n", plate.getContents(), plate);
        mug.empty();
        plate.consumeContents();
    }
}
