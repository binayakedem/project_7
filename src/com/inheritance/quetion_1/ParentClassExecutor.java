package com.inheritance.quetion_1;
//Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class
public class ParentClassExecutor {
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        ParentClass parentClass=new ParentClass();


//        1 - method of parent class by object of parent class
        System.out.println("1 - method of parent class by object of parent class");
        parentClass.display();

//    2 - method of child class by object of child class
        System.out.println("2 - method of child class by object of child class");
        childClass.displayc();

//      3 - method of parent class by object of child class
        System.out.println("3 - method of parent class by object of child class");
        childClass.display();
    }
}
