package ClassicalArrays;

import java.util.Arrays;

public class SN8_Count_condition_based_values_Even_Odd {

    static void main() {

        int[] inputArray = {4,5,2,9,6,7};
        int[] partionedArray = new int[inputArray.length];
        int filledcount = 0;

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] % 2 == 0) {
                partionedArray[filledcount] = inputArray[i];
                filledcount++;
            }
        }

        for(int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] % 2 != 0) {
                partionedArray[filledcount] = inputArray[i];
                filledcount++;
            }
        }

        System.out.println(Arrays.toString(partionedArray));


    }


}
