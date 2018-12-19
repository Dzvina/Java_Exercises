package ParametersAndReturn;

public class SumOfRange {

    public static int sumOfRange(int min, int max){
        int sum = 0;
        for (int i = min; i<= max; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfRange(3,7));
        System.out.println(sumOfRange(7,3));
    }
}
