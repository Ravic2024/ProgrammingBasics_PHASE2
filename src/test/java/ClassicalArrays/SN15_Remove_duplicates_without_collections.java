package ClassicalArrays;

import java.util.Arrays;

public class SN15_Remove_duplicates_without_collections {


    static void main() {

          int[] arr = {1,2,1,2,3,4,2,4,5,6};
          int[] temp = new int[arr.length];
          int value = 2;
          int count = 0;
          int duplicateCount = 0;

          for(int i = 0; i < arr.length; i++) {
              boolean duplicate = false;
              for(int j = 0; j < count; j++) {
                  if(arr[i] == temp[j]) {
                      duplicate = true;
                      if(arr[i] == value){
                          duplicateCount++;
                      }
                      break;
                  }
              }
              if(!duplicate) {
                  temp[count] = arr[i];
                  count++;
              }
          }
          int[] result = Arrays.copyOf(temp, count);
          System.out.println(Arrays.toString(result));
          System.out.println(value +" -> "+duplicateCount);
    }
}



