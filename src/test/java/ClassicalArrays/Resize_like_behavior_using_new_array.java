package ClassicalArrays;

import java.util.Arrays;

public class Resize_like_behavior_using_new_array {

    static void main() {

    int[] arr = {10,20,30};
    int newValue = 40;
    int[] newArry = new int[arr.length + 1];

    for(int i = 0; i < arr.length; i++) {
        newArry[i] = arr[i];
    }
    newArry[newArry.length - 1] = newValue;

    for(int n:newArry) {
        System.out.print(n+" ");
    }

    }
}
