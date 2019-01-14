package Strings;

import java.util.Scanner;

public class CountWords {

    public static int countWords(String text) {
        int temp = 0;
        String[] sentence = text.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            temp++;
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write sentence ");
        String sentence = scanner.nextLine();

        countWords(sentence);
    }
}
