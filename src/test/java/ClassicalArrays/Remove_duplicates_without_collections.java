package ClassicalArrays;

import java.util.Arrays;

public class Remove_duplicates_without_collections {


    static void main() {

        int[] arr = {1,2,4,3,3,5,6,4,5};
        int[] temp = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for(int j = 0; j < count; j++) {
                if(arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                temp[count] = arr[i];
                count++;
            }

        }

        int[] result = new int[count];

        for(int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        for(int n:result) {
            System.out.print(n+" ");
        }
    }
}



