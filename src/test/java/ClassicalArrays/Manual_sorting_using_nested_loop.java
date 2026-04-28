package ClassicalArrays;

import java.util.Arrays;

public class Manual_sorting_using_nested_loop {


    static void main() {

      int[] arr = {5,2,8,1,4,3};

      for(int i = 0; i < arr.length; i++){
          for(int j = i+1; j < arr.length; j++) {
              if(arr[i] > arr[j]) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }
        System.out.println(Arrays.toString(arr));


    }

}
