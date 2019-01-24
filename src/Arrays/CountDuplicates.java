package Arrays;

public class CountDuplicates {

    public static int countDuplicates(int[] arr) {
        String result = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (result.contains("," + Integer.toString(arr[i]) + ",")) {
                count ++;
            } else {
                result += "," + arr[i] + ",";
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr1 = {1};
        int[] arr = {1, 4, 2, 4, 7, 1, 1, 9, 2, 3, 4, 1};
        System.out.println(countDuplicates(arr1));
        System.out.println(countDuplicates(arr));
    }
}
