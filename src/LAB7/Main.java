package LAB7;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.Wing wing = plane.new Wing(100);
        System.out.println("Вес  первого крыла: " + wing.getWeight());

        Plane plane2 = new Plane();
        Plane.Wing wing2 = plane2.new Wing();
        wing2.setWeight(200);
        System.out.println("Вес второго крыла: " + wing2.getWeight());


    }
}
