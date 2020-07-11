package com.company.Figures;

import java.util.Objects;

public class Rectangle extends Figure {
    protected final static String NAME = "Прямоугольник";

    protected int lenght;
    protected int widht;

    public Rectangle(int lenght, int widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    @Override
    public double calcSquare() {
        double s = lenght * widht;
        return s;
    }

    @Override
    public double calcPerimeter() {
        double p = 2 * (lenght + widht);
        return p;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", widht=" + widht +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return lenght == rectangle.lenght &&
                widht == rectangle.widht;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenght, widht);
    }
}
