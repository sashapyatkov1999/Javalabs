package LAB3.task3;

public class HouseMain {
    public static void main(String[] args) {
        House house1 = new House(5, 2000, "Дом на улице Таманская");
        house1.printAll();
        System.out.println("Количество лет с момента постройки: " + house1.getYearsSinceBuilt());
        System.out.println();

        House house2 = new House(5, 1970, "Дом на улице Ленина");
        house2.printAll();
        System.out.println("Количество лет с момента постройки: " + house2.getYearsSinceBuilt());
        System.out.println();

        house1.setAll(11, 1995, "Дом на площади Мужества");
        house1.printAll();
        System.out.println();
    }
}
