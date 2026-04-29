package Basics.Vowels;

public class RegEx {

    static void main() {

        String word = "Automation";
        int count = word.replaceAll("(?i)[^aeiou]","").length();
        System.out.println(count);
    }
}
