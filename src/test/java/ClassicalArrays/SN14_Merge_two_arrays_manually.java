package ClassicalArrays;

import java.util.Arrays;

public class SN14_Merge_two_arrays_manually {


    static void main() {

        int[] a = {2,5,7};
        int[] b = {8,3,5,5};
        int[] merged = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for(int i = 0; i < b.length; i++) {
            merged[a.length+i] = b[i];
        }

        System.out.println(Arrays.toString(merged));


    }


}
