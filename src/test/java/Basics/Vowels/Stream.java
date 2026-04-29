package Basics.Vowels;

public class Stream {

    static void main() {

        String word = "Automation";

        long count = word.toLowerCase().
                chars().
                filter(ch -> "aeiou".indexOf(ch) != -1).
                count();
        System.out.println(count);
    }
}
