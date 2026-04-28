package ClassicalArrays;

public class Sum_and_average {

    static void main() {

        int[] arr = {10,20,30,40,60,50};
        int sum = 0;
        double average = 0.0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        average = sum / arr.length;
        System.out.println(average);

    }

}
