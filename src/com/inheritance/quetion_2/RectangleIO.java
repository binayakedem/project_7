package com.inheritance.quetion_2;

import java.util.Scanner;

public class RectangleIO {
        Scanner sc=new Scanner(System.in);
    public Rectangle inputRectangle(){
        float len,bre;
        System.out.println("Enter the length of the rectangle:");
        len=sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle:");
        bre=sc.nextFloat();
        return new Rectangle(len,bre);
    }

    public Square inputSquare(){
        float side;
        System.out.println("Enter the one side of square:");
        side=sc.nextFloat();
        return new Square(side);
    }
}
