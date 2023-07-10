package LAB6.Task5;

import java.util.Scanner;

public class MainClass {
    protected int age;
    protected Scanner scanner;

    public MainClass(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public  void getInfo() {
        System.out.print("Сколько лет: ");
        age = scanner.nextInt();
    }
}
