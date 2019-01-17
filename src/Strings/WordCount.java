package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

    public static void wordCount(String text) {
        char character = ' ';
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (character == text.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        wordCount(text);
    }
}
