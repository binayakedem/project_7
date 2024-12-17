package com.inheritance.quetion_2;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.
public class Rectangle {
    float length,breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void areaOfRectangle(){
        System.out.println("Area of rectangle is:"+(length*breadth));
    }
    void perimeterOfRectangle(){
        System.out.println("Perimeter of rectangle is:"+(2*(length+breadth)));
    }
}

class Square extends Rectangle{

    public Square( float side){
      super(side,side);
    }
}