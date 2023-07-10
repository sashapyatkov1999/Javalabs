package LAB5;

import java.io.IOException;

public class Task1  {
    //1.	Написать метод для поиска самого длинного слова в тексте.
    public static void main(String[] args) throws IOException {
        System.out.println(longestWord("Я очень счастлив"));
    }

    public static String longestWord(String proposal) throws IOException {
        String[] words = proposal.split(" ");
        String longestWord = "";
        if (proposal == null || proposal.trim().isEmpty()){
            return longestWord = "Нет Текста";
        }
        for (String word: words) {
            if (word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

}
