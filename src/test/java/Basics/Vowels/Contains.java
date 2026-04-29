package Basics.Vowels;

public class Contains {
    static void main() {
        String word = "Automation";
        int count = 0;

        for(char ch : word.toLowerCase().toCharArray()) {
            if("aeiou".contains(String.valueOf(ch))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
