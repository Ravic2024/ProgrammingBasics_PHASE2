package ClassicalArrays;

import java.util.Arrays;

public class Merge_two_arrays_manually {


    static void main() {

        int[] a = {2, 4, 6};
        int[] b = {4, 5, 7};
        int[] merged = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for(int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        System.out.println(Arrays.toString(merged));
    }


}
