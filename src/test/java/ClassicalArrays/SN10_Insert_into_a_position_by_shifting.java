package ClassicalArrays;

public class SN10_Insert_into_a_position_by_shifting {

    static void main() {

        int[] arr = {10,20,30,40};
        int value = 25;
        int position = 2;
        int[] temp = new int[arr.length + 1];

        for(int i = 0; i < position; i++) {
            temp[i] = arr[i];
        }

        temp[position] = value;

        for(int i = position; i < arr.length; i++) {
            temp[i + 1]  = arr[i];
        }

        for(int n: temp) {
            System.out.print(n+" ");
        }
    }
}
