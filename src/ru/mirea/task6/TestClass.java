package ru.mirea.task6;

public class TestClass {
    public static void main(String[] args){
        City city=new City("Moscow");
        Planet planet=new Planet("Pluto");
        Pet cat=new Pet("Martha");
        System.out.println(city.getName());
        System.out.println(planet.getName());
        System.out.println(cat.getName());

        Car car=new Car(999000);
        House house=new House(8950000);
        Bread bread=new Bread(35.57);
        System.out.println(car.getPrice());
        System.out.println(house.getPrice());
        System.out.println(bread.getPrice());
    }
}
