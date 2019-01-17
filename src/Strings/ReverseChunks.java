package Strings;

import java.util.Scanner;

public class ReverseChunks {

    public static void reverseChunks(String word, int num) {

        int iterations = word.length() / num;
        String result = "";
        int counter = 0;
        String tail1 = "";

        if (iterations * num == word.length()) {
            result = revertCharacters(word, num, iterations, result, counter);
        } else {
            for (int k = iterations * num; k < word.length(); k++) {
                tail1 += word.charAt(k);
            }
            result = revertCharacters(word, num, iterations, result, counter);
            result = result.concat(tail1);
        }
        System.out.println(result);
    }

    private static String revertCharacters(String word, int num, int iterations, String result, int counter) {
        for (int i = 0; i < iterations * num; i++) {
            counter++;
            if (counter % num == 0) {
                for (int k = i; k > i - num; k--) {
                    result += word.charAt(k);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write yuor text: ");
        String type = scanner.nextLine();
        System.out.print("Write your number: ");
        int num = scanner.nextInt();
        reverseChunks(type, num);
    }
}
