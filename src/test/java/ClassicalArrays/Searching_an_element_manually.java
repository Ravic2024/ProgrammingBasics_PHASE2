package ClassicalArrays;

public class Searching_an_element_manually {

    static void main() {

        int[] arr = {10,20,30,40,50};
        int target = 30;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found": "Not Found");
    }

}
