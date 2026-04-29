package ClassicalArrays;

public class SN4_Searching_an_element_manually {

    static void main() {
        int[] arr = {10,7,20,40};
        int target = 20;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found":"Not Found");
    }

}
