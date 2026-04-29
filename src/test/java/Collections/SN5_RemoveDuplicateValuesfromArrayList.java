package Collections;

import java.util.ArrayList;

public class SN5_RemoveDuplicateValuesfromArrayList {

    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> unique = new ArrayList<>(); //new bucket

        for(int number: numbers) {
            if(!unique.contains(number)) {
                unique.add(number);
            }
        }
        System.out.println(numbers);
        System.out.println(unique);
    }
}
