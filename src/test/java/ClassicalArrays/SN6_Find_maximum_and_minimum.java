package ClassicalArrays;

public class SN6_Find_maximum_and_minimum {

    static void main() {

        int[] arr = {4,10,6,3,8,14,5,2};

        int MAX = arr[0];
        int MIN = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > MAX) {
                MAX = arr[i];
            }
            if(arr[i] < MIN) {
                MIN = arr[i];
            }
        }
        System.out.println(MAX);
        System.out.println(MIN);
   }
}
