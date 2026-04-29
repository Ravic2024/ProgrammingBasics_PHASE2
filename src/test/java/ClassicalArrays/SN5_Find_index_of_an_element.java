package ClassicalArrays;

public class SN5_Find_index_of_an_element {

    static void main() {

        int[] arr = {10,20,30,40,50};
        int target = 30;
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
