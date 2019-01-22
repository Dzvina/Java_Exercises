package Arrays;

public class A5_6Mystery_5 {

    public static void mystery3(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {42};
        mystery3(a1);
        int[] a2 = {14, 7};
        mystery3(a2);
        int[] a3 = {7, 1, 3, 2, 0, 4};
        mystery3(a3);
        int[] a4 = {10, 8, 9, 5, 5};
        mystery3(a4);
        int[] a5 = {12, 11, 10, 10, 8, 7};
        mystery3(a5);
    }
}
