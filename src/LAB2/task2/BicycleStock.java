package LAB2.task2;

public class BicycleStock {
    public static void main(String[] args) {
        Bicycle bicycleStels = new Bicycle();
        bicycleStels.setModel("STELS");
        bicycleStels.setPrice(10000);
        bicycleStels.setFrameMaterial("Steel");
        bicycleStels.setSpeedCount(30);
        bicycleStels.setWheelSize(50);
        Bicycle bicycleGT = new Bicycle("GT", 45, 40, "Stell", 50000 );
        System.out.println(bicycleGT);
        System.out.println(bicycleStels);
    }
    //
}
