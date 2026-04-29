package HashMap;

import java.util.HashMap;

public class PrintHashMapUsingentrySet {


    static void main() {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ravi");
        map.put(102, "Kumar");
        map.put(103, "Selenium");

        for(Integer key: map.keySet()) {
            System.out.println(key+" - > "+map.get(key));
        }
    }
}
