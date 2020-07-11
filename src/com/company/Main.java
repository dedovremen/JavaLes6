package com.company;

import com.company.Figures.*;

public class Main {

    public static void main(String[] args) {

        Figure figuresArrow [] = new Figure[5];
        figuresArrow[0] = new Square(4);
        figuresArrow[1] = new Rectangle(3, 5);
        figuresArrow[2] = new Triangle(2, 6);
        figuresArrow[3] = new Ellipse(1, 3);
        figuresArrow[4] = new Circle(7);

        for (int i = 0; i < figuresArrow.length; i++) {
            System.out.println(figuresArrow[i].getName() + "\n"
                    + "Периметр = " + figuresArrow[i].calcPerimeter() + "\n"
                    + "Площадь = " + figuresArrow[i].calcSquare()
                    + "\n");
        }

    }
}
