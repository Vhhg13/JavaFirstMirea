package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args){
        Furniture[] furnitures=new Furniture[3];
        furnitures[0]=new Chair("steel", "grey");
        furnitures[1]=new Wardrobe("wooden", "brown");
        furnitures[2]=new Table("wooden", "yellow");
        furnitures[0].testOut();
        furnitures[1].testOut();
        furnitures[2].testOut();
        System.out.println("You didn't like anything. You leave having bought nothing.");
    }
}
