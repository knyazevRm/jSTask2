package ru.dataart.academy.java.figures;

public class Calculator {

    public static double calcSumOfSquare(Figure[] figures) {
        double sumOfSquare = 0;
        for (Figure figure : figures) {
            sumOfSquare += figure.square();
        }
        return sumOfSquare;
    }
}
