package LAB4.part2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Заполнить массив:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int element = array[i];
            boolean unique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && element == array[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("Первый уникальный элемент в массиве: " + element);
                return;
            }
        }
        System.out.println("Уникальный элемент не найден.");
    }
}
