package ClassicalArrays;

public class SN11_Reverse_an_array_using_swap {

    static void main() {

        int[] arr = {10,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int n:arr) {
            System.out.print(n+" ");
        }
    }
}
