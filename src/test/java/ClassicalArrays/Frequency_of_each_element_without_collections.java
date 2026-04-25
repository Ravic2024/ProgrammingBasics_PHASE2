package ClassicalArrays;

public class Frequency_of_each_element_without_collections {

    static void main() {

        int[] arr = {2,4,3,4,3,2,5,4,6};
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) {
                continue;
            }

            int count = 1;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+ " -> "+count);
        }
    }












}
