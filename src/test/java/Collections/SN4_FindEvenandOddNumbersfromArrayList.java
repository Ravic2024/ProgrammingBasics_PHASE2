package Collections;

import java.util.ArrayList;

public class SN4_FindEvenandOddNumbersfromArrayList {

    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int n:numbers) {
            if(n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }












}
