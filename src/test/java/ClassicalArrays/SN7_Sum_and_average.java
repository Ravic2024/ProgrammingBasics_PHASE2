package ClassicalArrays;

public class SN7_Sum_and_average {

    static void main() {

        int[] arr = {30, 50, 80,40,50};
        int sum = 0;
        double average = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println(sum);
        System.out.println(average);
    }

}
