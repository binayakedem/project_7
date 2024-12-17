package com.inheritance.quetion_2;

public class RectangleExecutor {
    public static void main(String[] args) {

        RectangleIO rectangleIO=new RectangleIO();
        Rectangle rectangle=rectangleIO.inputRectangle();
        Square square=rectangleIO.inputSquare();

        System.out.println("This is the Rectangle");
        rectangle.areaOfRectangle();
        rectangle.perimeterOfRectangle();

        System.out.println("This is the square");
        square.areaOfRectangle();
        square.perimeterOfRectangle();
    }
}
