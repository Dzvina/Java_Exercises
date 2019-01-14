import java.util.Scanner;

public class ContainsTwice {

    public static boolean containsTwice(String string, char character) {
        int numberOfMatches = 0;
        /*for (char i: string.toCharArray() ){
            if (i == character) {
                numberOfMatches++;
            }
        }*/

        /*for (int i = 0; i < string.length(); i++) {
            if (string.toCharArray() [i] == character) {
                numberOfMatches++;
            }
        }*/

        char[] mas = string.toCharArray();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == character) {
                numberOfMatches++;
            }
        }

        return numberOfMatches > 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write word ");
        String word = scanner.nextLine();
        System.out.print("Write character ");
        char ch = scanner.next().charAt(0);

        System.out.println(containsTwice(word, ch));
    }
}
