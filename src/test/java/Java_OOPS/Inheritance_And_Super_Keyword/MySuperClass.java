package Java_OOPS.Inheritance_And_Super_Keyword;

public class MySuperClass {

    String superStr = "super class string";
    String commonStr = "super common string";

    public MySuperClass(String constructorStr) {
        System.out.println("super class constructor");
        System.out.println(constructorStr);
    }

    public void superClassMethod() {
        System.out.println("super class method");
    }

    public void commonMethod() {
        System.out.println("super common method");
    }


    //Inheritance: one class acquire properties (methods and variables) of another class
    //Why?? Reusability
    //How?? Using extends keyword

    //SubClass = Child class
    //SuperClass = Parent class

    //Important points:
    //Subclass can have its own methods and fields in addition with Superclass methods and fields
    //Subclass can have only one Superclass. In other words, Multiple inheritance is not supported
    //Subclass cannot inherit the constructor from Superclass but, can invoke a constructor from Subclass

    //Super Keyword:
    //Used to differentiate the methods and fields of Superclass from methods and fields of Subclass, if they have same names
    //Used to invoke the constructor of Superclass from Subclass


}
