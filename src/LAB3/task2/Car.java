package LAB3.task2;

public class Car {
    public static void main(String[] args) {
        ProstoyClass car1 = new ProstoyClass("красный", "BMW", 1500);
        ProstoyClass car2 = new ProstoyClass("синий", 1200);
        ProstoyClass car3 = new ProstoyClass("желтый");
        car1.printData();
        car2.printData();
        car3.printData();
    }

}
