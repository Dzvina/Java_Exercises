package Arrays;

public class ComputeAverage {

    public static void computeAverage(int[] arr) {
        int count = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        double result = (double) count / i;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        computeAverage(arr);
    }
}
