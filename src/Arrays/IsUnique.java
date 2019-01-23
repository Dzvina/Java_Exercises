package Arrays;

public class IsUnique {

    public static boolean isUnique(int[][] mas) {
        String result = "";
        for (int i = 0; i < mas.length; i++) {
            for (int k = 0; k < mas[i].length; k++) {

                if (result.contains("," + Integer.toString(mas[i][k]) + ",")) {
                    return false;
                } else {
                    result += "," + mas[i][k] + ",";
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 8, 12}, {2, 9, 17}, {43, -8, 46}, {203, 14, 97}};
        int[][] matrix2 = {{4, 7, 2}, {3, 9, 12}, {-47, -19, 308}, {3, 74, 15}};

        System.out.println(isUnique(matrix));
        System.out.println();
        System.out.println(isUnique(matrix2));
    }
}
