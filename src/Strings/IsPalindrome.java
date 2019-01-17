package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPalindrome {

    public static boolean isPalindrome(String text) {
        String returns = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            returns += text.charAt(i);
        }
        if (text.equals(returns)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println(isPalindrome(text.toLowerCase()));
    }
}
