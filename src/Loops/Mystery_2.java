package Loops;

public class Mystery_2 {

    public static void main(String[] args) {
        System.out.println(loopMysteryExam1(1600,40));
//        loopMysteryExam1(1600,40);

    }

    public static int loopMysteryExam1(int i, int j) {
        while (i !=0 && j !=0){
            i = i/j;
            j=(j-1)/2;
            System.out.print(i + " " + j + " ");
        }
        System.out.println(i);
        return i+j;

    }
}
