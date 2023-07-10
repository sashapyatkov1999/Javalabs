package LAB5;

public class task4 {
    public static int index(String text1, String text2){
        int count = 0 ;
        int index = 0;
        while ((index = text2.indexOf(text1,index)) != -1){
            index += text1.length();
            count++;
        }
        return  count;
    }
}
