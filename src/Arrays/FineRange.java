package Arrays;

public class FineRange {

    public static void range(int[] arr) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        if (smallest < 0) {
            smallest *= -1;
            int result = biggest - smallest + 1;
            System.out.println(result);
        } else {
            int result = biggest - smallest + 1;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        range(arr);
    }
}
