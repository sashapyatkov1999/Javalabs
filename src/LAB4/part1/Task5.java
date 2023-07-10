package LAB4.part1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] nums = new int[number];
        if (number >= 2) {
            for (int i = 0; i < number; i++) {
                System.out.printf("array = ", i);
                nums[i] = scanner.nextInt();
            }
        }
        boolean result = nums[0] == 3 || nums[number-1] ==3;
        System.out.println(result);

    }

}
