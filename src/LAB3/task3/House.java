package LAB3.task3;

public class House {
    private int floors;
    private int yearBuilt;
    private String name;

    public House(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void setAll(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public void printAll() {
        System.out.println("Наименование: " + name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + yearBuilt);
    }

    public int getYearsSinceBuilt() {
        int year = 2023;
        return year-yearBuilt;
    }
}

