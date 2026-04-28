package Java_OOPS.Inheritance_And_Super_Keyword;

public class MyClass {

    static void main() {
        MySubClass mySubClass = new MySubClass("Constructor String from myClass");
        System.out.println(mySubClass.superStr);
        mySubClass.superClassMethod();
        mySubClass.subClassMethod();
        mySubClass.printSubString();
        mySubClass.printCommonMthod();

    }
}
