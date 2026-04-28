package Java_OOPS.Inheritance_And_Super_Keyword;

public class MySubClass extends MySuperClass {

    String commonStr = "sub common string";

    public MySubClass(String constructorStr) {
        super(constructorStr);
        System.out.println("sub class constructor");
    }

    public void subClassMethod() {
        System.out.println("sub class method");
    }

    public void printSubString() {
        System.out.println(commonStr);
        System.out.println(super.commonStr);
    }

    public void commonMethod() {
        System.out.println("sub common method");
    }

    public void printCommonMthod(){
        commonMethod();
        super.commonMethod();
    }
}
