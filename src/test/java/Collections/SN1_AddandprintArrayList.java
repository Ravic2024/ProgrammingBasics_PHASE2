package Collections;

import java.util.ArrayList;

public class SN1_AddandprintArrayList {

    static void main() {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Jai");
        names.add("kumar");

        for(String name: names) {
            System.out.println(name);
        }
    }
}
