package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SN7_SortArrayList {

    static void main() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers);
        System.out.println(numbers);



    }




}
