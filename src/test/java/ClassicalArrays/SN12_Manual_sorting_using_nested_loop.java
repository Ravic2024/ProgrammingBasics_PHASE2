package ClassicalArrays;

public class SN12_Manual_sorting_using_nested_loop {

    static void main() {
        int[] arr = {6,3,5,8,1,2};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int n: arr) {
            System.out.print(n+" ");
        }


    }

}
