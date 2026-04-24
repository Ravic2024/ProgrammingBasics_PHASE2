package Basics.Vowels;

import javax.xml.stream.events.Characters;
import java.util.Set;

public class SetContains {

    static void main() {
        String word = "Automation";
        int count = 0;
        char[] chars = word.toLowerCase().toCharArray();
        Set<Character> vowels = Set.of('a','e','i','o','u');

        for(char ch : chars) {
            if(vowels.contains(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
