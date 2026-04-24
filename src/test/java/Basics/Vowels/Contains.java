package Basics.Vowels;

public class Contains {
    static void main() {
        String word = "Automation";
        int count = 0;
        char[] ch = word.toLowerCase().toCharArray();

        for(int i = 0; i < ch.length; i++){
            if("aeiou".contains(String.valueOf(ch[i]))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
