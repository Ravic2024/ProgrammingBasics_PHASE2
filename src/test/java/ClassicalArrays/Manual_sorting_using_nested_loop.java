package ClassicalArrays;

public class Manual_sorting_using_nested_loop {


    static void main() {

        int[] arr = {5, 7, 2, 6, 1, 9};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int n: arr) {
            System.out.print(n+" ");
        }

    }

}
