package ClassicalArrays;

public class Insert_into_a_position_by_shifting {


    static void main() {

        int[] arr = {10,20,30,40};
        int value = 25;
        int position = 2;
        int[] result = new int[arr.length + 1];

        for(int i = 0; i < position; i++) {
            result[i] = arr[i];
        }

        result[position] = value;

        for(int i = position; i < arr.length; i++) {
            result[i+1] = arr[i];
        }

        for(int n : result) {
            System.out.print(n+" ");
        }

    }


}
