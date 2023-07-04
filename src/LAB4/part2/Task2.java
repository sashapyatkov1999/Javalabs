package LAB4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Numbers of array");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(array));
    }
}
