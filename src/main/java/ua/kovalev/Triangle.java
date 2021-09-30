package ua.kovalev;

import java.math.BigDecimal;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
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

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
