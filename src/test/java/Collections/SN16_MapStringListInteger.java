package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SN16_MapStringListInteger {


    static void main() {


        int[] arr = {10,15,20,25,30,35};

        Map<String, List<Integer>> map = new HashMap<>();

        map.put("EVEN", new ArrayList<>());
        map.put("ODD", new ArrayList<>());

        for(int n: arr) {
            if(n % 2 == 0) {
                map.get("EVEN").add(n);
            } else {
                map.get("ODD").add(n);
            }
        }
        System.out.println(map);
    }
}
