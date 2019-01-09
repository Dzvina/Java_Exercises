package Strings;

public class Repeat {

    public static String repeat(String word, int num) {
        while (num > 0) {
            System.out.print(word);
            num--;
        }

        return word;
    }

    public static void main(String[] args) {
        repeat("Ball", 3);
    }
}
