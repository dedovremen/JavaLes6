package com.company.Figures;

import java.util.Objects;

public class Ellipse extends Figure{
    protected final static String NAME = "Овал";

    protected int littleSemiaxis;
    protected int bigSemiaxis;

    public Ellipse(int littleSemiaxis, int bigSemiaxis) {
        this.littleSemiaxis = littleSemiaxis;
        this.bigSemiaxis = bigSemiaxis;
    }

    @Override
    public double calcSquare () {
        double elSquare = Math.PI * littleSemiaxis * bigSemiaxis;
        return elSquare;
    }

    @Override
    public double calcPerimeter () {
        double elPerimeter = 4 * (((Math.PI)*littleSemiaxis*bigSemiaxis) + (Math.abs(littleSemiaxis-bigSemiaxis))) / (littleSemiaxis + bigSemiaxis);
        return elPerimeter;
    }

    @Override
    public String getName () {
        return NAME;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Ellipse)) return false;
        Ellipse ellipse = (Ellipse) o;
        return littleSemiaxis == ellipse.littleSemiaxis &&
                bigSemiaxis == ellipse.bigSemiaxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(littleSemiaxis, bigSemiaxis);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "littleSemiaxis=" + littleSemiaxis +
                ", bigSemiaxis=" + bigSemiaxis +
                '}';
    }
}
