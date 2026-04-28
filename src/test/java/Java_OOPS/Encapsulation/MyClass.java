package Java_OOPS.Encapsulation;

public class MyClass {

    static void main() {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setStr("updated my string");
       // System.out.println(myPrivateClass.getStr());
        myPrivateClass.printString();

    }
}




//Encapsulation: Wrapping up of data under a single unit! The data is protected!!

//How??
//By making the class attributes or variables as private
//By making the methods as private

//Use getters and Setters to access the private attributes

//Advantages:
//1)Data Hiding
//2)Flexible to use variable as Read only or Write only
//3)Reusability



