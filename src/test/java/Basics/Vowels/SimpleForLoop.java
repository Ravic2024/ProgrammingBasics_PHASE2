package Basics.Vowels;

public class SimpleForLoop {

    static void main() {

        String word = "Automation";
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
