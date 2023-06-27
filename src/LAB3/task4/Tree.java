package LAB3.task4;

public class Tree {
    private int eight;
    private boolean isAlive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int eight, boolean isAlive, String name) {
        this.eight = eight;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree(int eight, String name) {
        this.eight = eight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "eight=" + eight +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }
}
