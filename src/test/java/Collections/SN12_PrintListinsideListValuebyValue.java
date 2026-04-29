package Collections;

import java.util.ArrayList;
import java.util.List;

public class SN12_PrintListinsideListValuebyValue {

    static void main() {

        List<String> team1 = new ArrayList<>();
        team1.add("Ravi");
        team1.add("Kumar");

        List<String> team2 = new ArrayList<>();
        team2.add("John");
        team2.add("David");

        List<List<String>> teams = new ArrayList<>();

        teams.add(team1);
        teams.add(team2);

        for(List<String> names: teams) {
            for(String name: names) {
                System.out.println(name);
            }
        }
    }







}
