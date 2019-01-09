package Strings;

public class PrintBackward {

    public static void printBackward(String word){
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        System.out.println(buffer);

    }

    public static void main(String[] args) {
        printBackward("Big red ball");
    }
}
