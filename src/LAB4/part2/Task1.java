package LAB4.part2;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5};
        if (isSorted(nums)) {
            System.out.println("OK"); // если отсортирован по возрастанию
        } else {
            System.out.println("Please, try again"); // если не отсортирован по возрастанию
        }
    }
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}