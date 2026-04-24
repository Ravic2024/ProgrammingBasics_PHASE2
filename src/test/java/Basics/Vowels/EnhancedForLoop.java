package Basics.Vowels;

public class EnhancedForLoop {

    static void main() {
        String word = "Automation";
        int count = 0;
        char[] ch = word.toLowerCase().toCharArray();
        //will not show array format in console

        for(char c: ch) { //can't use length
            if("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
