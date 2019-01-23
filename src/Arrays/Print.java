package Arrays;

public class Print {

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("element " + i + " is " + mas[i]);
        }
    }

    public static void main(String[] args) {
        int[] mas = {1,5,4,8,7,1,6,3,1,0,5,7,9};
        print(mas);
    }
}
