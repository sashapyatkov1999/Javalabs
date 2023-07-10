package LAB5;

public class Task5 {
    public static void main(String[] args) {
        String string = "This is a test string ";

        System.out.println(invertWord(string));

    }
    public static String invertWord(String text){
        String[] words = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i < words.length  ; i++) {
            String word = words[i];
            StringBuilder reverse = new StringBuilder(word);
            reverse.reverse();
            stringBuilder.append(reverse.toString() + " ");
        }
        return stringBuilder.toString().trim();
    }

}
