package Collections;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;

public class SN3_FindSumofArrayListNumbers {

    static void main() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0;

        for(int number: numbers) {
            sum = sum + number;
        }
    }
}
