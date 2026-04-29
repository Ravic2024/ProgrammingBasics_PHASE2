package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SN6_ConvertArrayListtoSettoRemoveDuplicates {


    static void main() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        //LinkedHashSet removes duplicates and also maintains insertion order.
        Set<Integer> uniqueSet = new LinkedHashSet<>(numbers);

        System.out.println(uniqueSet);

    }









}
