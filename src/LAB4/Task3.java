package LAB4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum(){
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите " + (i+1) + "-е число: ");
            numbers[i] = scanner.nextInt();
        }

        boolean result = numbers[0] + numbers[1] == numbers[2];

        System.out.println("Результат: " + result);
    }
}
