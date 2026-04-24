package ClassicalArrays;

public class Sum_and_average {

    static void main() {

        int[] arr = {32,34,45,60,24};
        int sum = 0;
        double average = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        average = sum /arr.length;

        System.out.println(sum);
        System.out.println(average);






    }

}
