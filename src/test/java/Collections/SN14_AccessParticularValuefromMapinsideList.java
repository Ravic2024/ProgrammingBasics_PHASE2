package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SN14_AccessParticularValuefromMapinsideList {

    static void main() {

        Map<String, String> emp1 = new HashMap<>();
        emp1.put("Name", "Ravi");
        emp1.put("Role", "Automation Architect");

        Map<String, String> emp2 = new HashMap<>();
        emp2.put("Name", "Kumar");
        emp2.put("Role", "QA Manager");

        List<Map<String, String>> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);

        for(Map<String, String> emp: employees) {
            System.out.println(emp.get("Name"));
            System.out.println(emp.get("Role"));
        }



    }












}
