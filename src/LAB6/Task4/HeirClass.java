package LAB6.Task4;

public class HeirClass extends  MainClass{
    public HeirClass(int number) {
        super(number);
    }

    void display() {
        System.out.println("Переменная: " + number);
    }
}
