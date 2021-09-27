package ua.kovalev;

import java.math.BigDecimal;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSquare(){
        double halfPerimeter = getHalfPerimeter();
        double square = Math.sqrt((halfPerimeter * ((halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3))));
        return BigDecimal.valueOf(square).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double getHalfPerimeter(){
        return (side1 + side2 + side3) / 2;
    }
}
