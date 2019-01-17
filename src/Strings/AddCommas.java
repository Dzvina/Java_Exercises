package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommas {
    public static void addCommas(String number) {
        ArrayList<Character> mas = new ArrayList<>();
        for (char c : number.toCharArray()) {
            mas.add(c);
        }

        ArrayList<Character> masFinish = new ArrayList<>();
        int counter = 1;
        for (int k = mas.size() - 1; k >= 0; k--) {
            masFinish.add(mas.get(k));
            if (counter % 3 == 0 && counter != mas.size()) {
                masFinish.add(',');
            }
            counter++;
        }

        for (int k = masFinish.size() - 1; k >= 0; k--) {
            System.out.print(masFinish.get(k));
        }
    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Write your number: ");
        String type = console.nextLine();

        addCommas(type);





       /* System.out.println("Hello World!");

        //вхідне число
        String ReverseChunks = "1234567890";

        //результат записуємо сюди
        String result = "";

        //ітератор другого масиву (виніс сюди, бо потрібно використовувати за межами циклу (останній іф))
        int j;

        //позиція на якому символі ми зараз знаходимося
        int position = 0;

        //проходимося по масиву з заду на перед з кроком в три елементи
        for (int i = ReverseChunks.length() - 1; i >= 0; i = i - 3) {
            //цикл для проходу по кожному з трьох елементів з попереднього циклу
            for (j = 0; j <= 2; j++) {
                //дістаємо позицію елемента (наприклад ми з самого початку витягнули три останніх символи тобто символи з комірок  9,8,7)
                position = i - j;
                //перевіряємо чи не вилізли за розміри нашого рядка
                if (position >= 0) {
                    result = ReverseChunks.charAt(i - j) + result;
                } else {
                    //якшо вилізли то виходимо з внутрішнього циклу
                    break;
                }
            }
            // якшо вийшли щ внутрішнього циклу то потрібно поставити кому
            if (j == 3) {
                result = ',' + result;
            }
        }

        System.out.println(result);*/
    }
}
