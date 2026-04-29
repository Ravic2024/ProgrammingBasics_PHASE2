package Collections;

import java.util.*;

public class SN13_MapinsideList {

    static void main() {

        Map<String, String> emp1 = new LinkedHashMap<>();
        emp1.put("Name", "Ravi");
        emp1.put("Role", "Automation Architect");
        emp1.put("Location", "Chennai");

        Map<String,String> emp2 = new LinkedHashMap<>();
        emp2.put("Name", "Kumar");
        emp2.put("Role", "QA Manager");
        emp2.put("Location", "Bangalore");

        List<Map<String, String>> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);

        for(Map<String, String> emp: employees) {
            System.out.println(emp);
        }
    }
}
