package LAB4.part1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        boolean b = oneOrThree(new int[]{2, 3, 4, 5});
        System.out.println(b);
    }
    public static boolean oneOrThree(int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
