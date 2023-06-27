package LAB3.task2;


public class ProstoyClass {
    private String color;
    private String name;

    public ProstoyClass(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public ProstoyClass(String color) {
        this.color = color;
    }

    public ProstoyClass() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;


    public ProstoyClass(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public void printData() {
        System.out.println("Название: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Вес: " + weight);
    }

    @Override
    public String toString() {
        return "ProstoyClass{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
