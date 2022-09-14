package ru.mirea.task2;

public class Shape {
    private double perimeter;
    private double area;

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape with " +
                "perimeter=" + perimeter +
                " and area=" + area;
    }


}
