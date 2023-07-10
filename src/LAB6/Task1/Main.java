package LAB6.Task1;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("дядя", "Валя", "ВТБ");
        client.setFirstName("Тетя");
        client.printInfo();
        Human bankWorker = new BankWorker("Александр", "Ишутин", "ВТБ");
        bankWorker.printInfo();
    }
}
