package LAB5;

public class Task2 {
    //2.Написать метод, который проверяет является ли слово палиндромом.
    public static void main(String[] args) {
        System.out.println(iSPolindrom("радар"));

    }
    public static boolean iSPolindrom(String word){
        String s = new StringBuilder(word).reverse().toString();
        return s.equals(word);
    }

}
