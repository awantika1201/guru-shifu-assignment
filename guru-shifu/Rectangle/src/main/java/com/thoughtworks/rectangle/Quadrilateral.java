package com.thoughtworks.rectangle;
public class Quadrilateral {
    private final double LENGTH;
    private final double BREADTH;

    private Quadrilateral(double length, double breadth){
        this.LENGTH=length;
        this.BREADTH =breadth;
    }

    public static Quadrilateral createRectangle(double length,double breadth){
        return new Quadrilateral(length,breadth);
    }

    public static Quadrilateral createSquare(double side){
        return new Quadrilateral(side,side);
    }

    public double area(){
        return LENGTH* BREADTH;
    }

    public double perimeter(){
        return 2*(LENGTH+ BREADTH);
    }
}
