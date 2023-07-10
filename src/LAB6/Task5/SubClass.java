package LAB6.Task5;

import java.util.Scanner;

public class SubClass extends MainClass {

    public SubClass(Scanner scanner) {
        super(scanner);
    }
    @Override
    public void getInfo() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Ваше имя: " + name);
    }
}
