package com.company.Figures;

import java.util.Objects;

public class Triangle extends Figure{
    protected final static String NAME = "Треугольник";

    protected int sideA;
    protected int sideB;

    public Triangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcSquare () {
        double s = (sideA * sideB) / 2;
        return s;
    }

    @Override
    public double calcPerimeter() {
        double p = sideA + sideB + Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return p;
    }

    @Override
    public String getName() {
        return NAME;
    }


    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA &&
                sideB == triangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
