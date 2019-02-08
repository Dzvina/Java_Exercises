package Arrays;

public class Split {

    public static void split(int[] arr) {
        int[] newArray = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            newArray[2 * i] = arr[i] / 2 + arr[i] % 2;
            newArray[2 * i + 1] = arr[i] / 2;
        }

        for (int k = 0; k < newArray.length; k++) {
            System.out.print(newArray[k] + ", ");
        }
    }

    public static void main(String[] args) {
        int[] list = {18, 7, 4, 24, 11};
        split(list);
    }
}
