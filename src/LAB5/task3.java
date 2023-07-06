package LAB5;

import java.util.Locale;

public class task3 {
    public static void main(String[] args) {
        System.out.println(censored("Бяка Евгеньевич"));
    }
    public static String censored(String byaka){
        return byaka.toLowerCase(Locale.ROOT).replace("бяка", "«[вырезано цензурой]»");
    }
}
