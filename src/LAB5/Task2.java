package LAB5;

import java.util.Locale;

public class Task2 {
    //2.Написать метод, который проверяет является ли слово палиндромом.
    public static void main(String[] args) {
        System.out.println(iSPolindrom("Топот"));

    }
    public static boolean iSPolindrom(String word){
        String s = new StringBuilder(word).reverse().toString().toLowerCase(Locale.ROOT);
        return s.equals(word.toLowerCase(Locale.ROOT));
    }

}
