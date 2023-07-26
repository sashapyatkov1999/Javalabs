package LAB9.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> userPoints = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        User user = new User(userName);
        Random random = new Random();
        User user1 = new User("Иван");
        User user2 = new User("Петр");

        userPoints.put(user1, random.nextInt(100));
        userPoints.put(user2, random.nextInt(100));

        if (userPoints.containsKey(user)){
            int points = userPoints.get(user);
            System.out.println("Очки пользователя " + userName + ": " + points);
        } else {
            System.out.println("У данного пользователя " + userName + " нет очков.");
        }
    }

}
