package com.thoughtworks.rectangle;
public class Quadrilateral {
    private final double length;
    private final double breadth;

    private Quadrilateral(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public static Quadrilateral createRectangle(double length,double breadth){
        return new Quadrilateral(length,breadth);
    }

    public static Quadrilateral createSquare(double side){
        return new Quadrilateral(side,side);
    }

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}
