package LAB4.part2;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));
        swapArray(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void swapArray(int[] array) {
        if (array.length < 2) {
            return;
        }
        int x = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = x;
    }
}
