package com.inheritance.question_3;

public class Shape {
    public void displayShape(){
        System.out.println("This is shape!");
    }
}

class Rectangle extends Shape{

    public void displayRectangle() {
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape{
    public void displayCircle() {
        System.out.println("This is circle");
    }
}

class Square extends Rectangle{
    public void displaySquare() {
        System.out.println("Square is rectangle");
    }
}