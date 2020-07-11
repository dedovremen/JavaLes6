package com.company.Figures;

import java.util.Objects;

public class Square extends Rectangle {
    protected final static String NAME = "Квадрат";

    protected int length;

    public Square(int length) {
        super(length, length);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return length == square.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
