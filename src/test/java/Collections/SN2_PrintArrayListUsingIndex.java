package Collections;

import java.util.ArrayList;

public class SN2_PrintArrayListUsingIndex {

    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }





}
