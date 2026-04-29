package Basics.Vowels;

import javax.xml.stream.events.Characters;
import java.util.Set;

public class SetContains {

    static void main() {
        String word = "Automation";
        int count = 0;
        Set<Character> vowels = Set.of('a','e','i','o','u');

        for(char ch : word.toLowerCase().toCharArray()) {
            if(vowels.contains(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
