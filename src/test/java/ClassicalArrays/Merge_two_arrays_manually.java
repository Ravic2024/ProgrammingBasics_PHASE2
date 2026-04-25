package ClassicalArrays;

public class Merge_two_arrays_manually {


    static void main() {

        int[] a = {2,4,7};
        int[] b = {8,5,1};
        int[] merged = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for(int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        for(int n:merged) {
            System.out.print(n+" ");
        }
    }









}
