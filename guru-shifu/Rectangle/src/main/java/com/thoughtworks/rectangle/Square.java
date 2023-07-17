package com.thoughtworks.rectangle;

public class Square {

    private final double SIDE;


    public Square(double side){
        SIDE=side;
    }

    public double area(){
        return SIDE*SIDE;
    }

    public double perimeter() {
        return 4*SIDE;
    }
}
