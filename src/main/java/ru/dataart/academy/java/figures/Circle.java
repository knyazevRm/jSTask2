package ru.dataart.academy.java.figures;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double perimeter() {
        return 2 * Math.PI * radius;
    }
}
