package LAB1;

import java.util.Scanner;

public class Labs {
    public static void main(String[] args) {
        // 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        // 2
        System.out.println(( 46 + 10 ) * ( 10.0 / 3 ));
        System.out.println(( 29 ) * ( 4 ) * (- 15 ));
        // 3
        int number = 10000;
        double result = (number*1.0/10)/10;
        System.out.println(result);
        // 4
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result2 = a*b*c;
        System.out.println(result2);
        //5
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        // 6
        int b6 = scanner.nextInt();
        if (b6%2 != 0){
            System.out.println("Нечетное");
        }else if (b6%2 == 0 && b6>100){
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}


