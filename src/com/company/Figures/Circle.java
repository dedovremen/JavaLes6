package com.company.Figures;

import java.util.Objects;

public class Circle extends Ellipse{
    protected final static String NAME = "Круг";

    private int radius;

    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public String getName () {
        return NAME;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
