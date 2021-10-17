package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double square() {
        return height * width;
    }

    @Override
    protected double perimeter() {
        return 2 * (height + width);
    }
}
