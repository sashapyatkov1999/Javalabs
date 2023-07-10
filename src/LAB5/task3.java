package LAB5;

import java.util.Locale;

public class task3 {
    public static void main(String[] args) {
        String original = "Бяка Евгеньевич";
        String wordToReplace = "бяка";
        String replacement = "«[вырезано цензурой]»";
        String censoredText = censored(original, wordToReplace, replacement);
        System.out.println(censoredText);
    }

    public static String censored(String original, String wordToReplace, String replacement) {
        return original.toLowerCase(Locale.ROOT).replace(wordToReplace.toLowerCase(Locale.ROOT), replacement);
    }
}
