package ParametersAndReturn;

public class ComputeDistance {

    public static double computeDistance(double x1, double y1, double x2, double y2) {
        double square = 2;
        return Math.sqrt(Math.pow(x2 - x1, square) + Math.pow(y2 - y1, square));
    }

    public static void main(String[] args) {
        System.out.println(computeDistance(10, 2, 3, 5));
    }
}
