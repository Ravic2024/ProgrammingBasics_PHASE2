package Basics.Vowels;

public class SwitchEx {

    static void main() {
        String word = "Automation";
        int count = 0;

        for(char ch : word.toLowerCase().toCharArray()) {
            switch(ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        System.out.println(count);
    }
}
