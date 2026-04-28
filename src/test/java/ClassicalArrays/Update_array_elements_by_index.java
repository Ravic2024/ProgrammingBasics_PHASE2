package ClassicalArrays;

import java.util.Arrays;

public class Update_array_elements_by_index {

    static void main() {

        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println(Arrays.toString(arr));




    }

}
