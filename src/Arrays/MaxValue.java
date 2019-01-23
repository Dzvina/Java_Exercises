package Arrays;

public class MaxValue {

    public static void maxValue(int[] mas) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < smallest) {
                smallest = mas[i];
            }
            if (mas[i] > biggest) {
                biggest = mas[i];
            }
        }
        System.out.println(biggest);
    }

    public static void main(String[] args) {
        int[] mas={52,95,41,20,3,87,120,3,-25,7,5,1,0};
        maxValue(mas);
    }
}

