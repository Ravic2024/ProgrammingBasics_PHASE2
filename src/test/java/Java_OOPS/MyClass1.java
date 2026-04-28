package Java_OOPS;

public class MyClass1 {


    static void main() {
        MyClass1 myClass1 = new MyClass1();
        myClass1.method1();
        MyClass myclass = new MyClass();
        //MyClass.initialize();
        System.out.println(myclass.i);
        System.out.println(MyConstants.LONG_WAIT);
        System.out.println(EnumConstants.MONDAY);

    }

    public void method1(){
        MyClass.initialize(); //If it is static method and variable,
        // you can use it from another class
        System.out.println(MyClass.i);
    }



}
