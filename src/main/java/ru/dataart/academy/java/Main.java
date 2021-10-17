package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");
        Figure[] figures = new Figure[]{new Circle(10), new Rectangle(8, 4), new Circle(3), new Rectangle(3, 4)};
        System.out.print("The total sum of the square of the figures: ");
        System.out.println(String.format("%.2f", Calculator.calcSumOfSquare(figures)));
    }
}