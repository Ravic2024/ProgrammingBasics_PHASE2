package ClassicalArrays;

public class Find_maximum_and_minimum {

    static void main() {

        int[] arr = {10,4,70,40,30,8};

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
