package ClassicalArrays;

import java.util.Arrays;

public class Count_condition_based_values_Even_Odd {

    static void main() {

        int[] inputArray = {10, 4, 5, 9, 6, 3};
        int[] partitionedArray = new int[inputArray.length];
        int filledCount = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] % 2 == 0) {
                partitionedArray[filledCount] = inputArray[i];
                filledCount++;
            }

        }
        System.out.println("collected even numbers :" + Arrays.toString(partitionedArray));

        for(int i =  0; i < inputArray.length; i++) {
            if(inputArray[i] % 2 != 0) {
                partitionedArray[filledCount] = inputArray[i];
                filledCount++;
            }
        }
        System.out.println("collected odd numbers :"+Arrays.toString(partitionedArray));

        int[] validElements = Arrays.copyOf(partitionedArray, filledCount);
        Arrays.sort(validElements);
        System.out.println(Arrays.toString(validElements));

    }


}
