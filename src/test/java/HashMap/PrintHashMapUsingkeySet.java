package HashMap;

import java.util.HashMap;
import java.util.Map;

public class PrintHashMapUsingkeySet {

    static void main() {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ravi");
        map.put(102, "Kumar");
        map.put(103, "Selenium");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}







