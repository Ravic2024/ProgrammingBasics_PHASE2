package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SN8_ReverseArrayList {


    static void main() {


        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Kumar");
        names.add("Selenium");

        Collections.reverse(names);
        System.out.println(names);
    }




}
