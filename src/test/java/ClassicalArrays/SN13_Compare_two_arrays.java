package ClassicalArrays;

public class SN13_Compare_two_arrays {

    static void main() {

        int[] a = {1,2,3};
        int[] b = {1,2,6};
        boolean same = true;

        if(a.length != b.length) {
            same = false;
        } else {
            for(int i = 0; i < a.length; i++) {
                if(a[i] != b[i]) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println(same ? "Equal":"Not Equal");
    }
}
