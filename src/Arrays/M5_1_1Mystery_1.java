package Arrays;

public class M5_1_1Mystery_1 {

    public static void arrayMystery2D(int[][] numbers) {
        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[0].length - 1; c++) {
                if (numbers[r][c + 1] > numbers[r][c]) {
                    numbers[r][c] = numbers[r][c + 1];
                }
                System.out.print(numbers[r][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {3, 4, 5, 6},
                {4, 5, 6, 7},
                {5, 6, 7, 8}
        };
        arrayMystery2D(numbers);
    }
}

