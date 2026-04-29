package ClassicalArrays;

public class SN9_Resize_like_behavior_using_new_array {

    static void main() {
        int[] arr = {10,20,30};
        int newValue = 40;
        int[] newArray = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length - 1] = newValue;

        for(int n:newArray) {
            System.out.print(n+" ");
        }
    }
}
