package ClassicalArrays.Mini;

import java.util.Arrays;

public class InPlace_Modify_Shift {

    static void main() {

        int[] arr = {2, 5, 6, 3, 4, 1};
        //System.out.println("start: " + java.util.Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println("after increament :" + Arrays.toString(arr));

        int count = 0;
        int threshold = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > threshold) {
                count++;
            }
        }
        System.out.println("count > " + threshold + " is " + count);

        for(int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = 0;
        System.out.println("after shift :"+Arrays.toString(arr));















    }

}
