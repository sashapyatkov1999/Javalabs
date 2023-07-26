package LAB9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

//        addLinked(linkedList);
//        addArray(arrayList);
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addLinkedAndArray(arrayList);
        addLinkedAndArray(linkedList);
        long start = System.currentTimeMillis();
        selectElement(arrayList, 10000);//39 ms
        long end = System.currentTimeMillis();
        long stat = end - start;
        System.out.println("Время на перебор элементов: " + stat);
        long start1 = System.currentTimeMillis();
        selectElement(linkedList,10000);// 20943 ms
        long end1 = System.currentTimeMillis();
        long stat1 = end1 - start1;
        System.out.println("Время на перебор элементов: " + stat1);

    }

    public static void selectElement(List<Integer> selectElement, int totalNumbers){
        Random random = new Random();
        for (int i = 0; i < totalNumbers; i++) {
           int randomIndex  = random.nextInt(selectElement.size());
           int randoElement = selectElement.get(randomIndex);
           System.out.println(randoElement);
        }
    }

    public static void addLinkedAndArray(List<Integer> linkedAndArrayList){
        int million = 1000000;
        Random random = new Random();
        for (int i = 0; i < million; i++) {
            linkedAndArrayList.add(random.nextInt());
        }
    }
//    public static void addLinked(LinkedList<Integer> linkedList){
//        int million = 1000000;
//        Random random = new Random();
//        for (int i = 0; i < million; i++) {
//            linkedList.add(random.nextInt());
//        }
//    }
//
//    public static void addArray(ArrayList<Integer> arrayList){
//        int million = 1000000;
//        Random random = new Random();
//        for (int i = 0; i < million; i++) {
//            arrayList.add(random.nextInt());
//        }
//    }
}
