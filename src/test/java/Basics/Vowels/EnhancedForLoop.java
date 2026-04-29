package Basics.Vowels;

public class EnhancedForLoop {

    static void main() {

        String word = "Automation";
        int count = 0;

        for(char ch : word.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
