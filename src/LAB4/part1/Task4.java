package LAB4.part1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        firstBiggerSecond();
    }

    public static void firstBiggerSecond(){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Введите " + (i + 1) + "-е число: ");
                numbers[i] = scanner.nextInt();
                if (numbers[1] > numbers[0] && numbers[2] > numbers[1]) {
                    boolean result = numbers[0] + numbers[1] == numbers[2];
                    System.out.println("Результат: " + result);
                }
            }
    }
}
