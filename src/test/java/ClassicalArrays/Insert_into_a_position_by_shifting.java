package ClassicalArrays;

public class Insert_into_a_position_by_shifting {


    static void main() {

      int[] arr = {10,20,30,40,50};
      int[] newArry = new int[arr.length + 1];
      int value = 25;
      int position = 2;

      for(int i = 0; i < position; i++) {
          newArry[i] = arr[i];
      }

      newArry[position] = value;

      for(int i = position; i < arr.length; i++) {
          newArry[i+1] = arr[i];
      }
        for(int n: newArry) {
            System.out.print(n+" ");
        }
    }


}
