package ru.mirea.task3;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius=1;
        color="Красный";
    }
    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="Красный";
    }
    public Circle(String color){
        this.radius=1;
        this.color=color;
    }

    // Геттеры
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    // Сеттеры
    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Остальное поведение
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
}
