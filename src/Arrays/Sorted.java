package Arrays;

public class Sorted {

    public static boolean sorted(double[] mas) {
        double lastValue = 0.0;
        int counter = 0;
        for (double d : mas) {
            if (counter > 0) {
                if (lastValue > d) {
                    return false;
                }
            }
            lastValue = d;
            counter++;
        }
        return true;
    }

    public static void main(String[] args) {
        double[] mas1 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        double[] mas2 = {10, 11, 12, 13, 14, 15, 16, 17, 16};

        if (sorted(mas1)) {
            System.out.println("Arr1 is ascending");
        } else {
            System.out.println("Arr1 isn't ascending");
        }

        if (sorted(mas2)) {
            System.out.println("Arr2 is ascending");
        } else {
            System.out.println("Arr2 isn't ascending");
        }
    }
}
