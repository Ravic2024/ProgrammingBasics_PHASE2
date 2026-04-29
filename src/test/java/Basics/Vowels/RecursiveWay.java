package Basics.Vowels;

public class RecursiveWay {

    static void main() {

        String word = "Automation";
        System.out.println(vowelCounts(word, 0));
    }

    private static int vowelCounts(String word, int index) {
        if(index == word.length()) return 0;
        char ch = Character.toLowerCase(word.charAt(index));
        int count = ("aeiou".indexOf(ch) != -1) ? 1 : 0;
        return count + vowelCounts(word, index+1);
    }

}
