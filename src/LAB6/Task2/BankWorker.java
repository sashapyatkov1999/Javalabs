package LAB6.Task2;

public class BankWorker extends Human {
    private String bankName;

    protected BankWorker(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }


    @Override
    public void printInfo() {
        System.out.println("BankWorker{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", bankName ='" + this.bankName + '\'' +
                '}');
    }
}
