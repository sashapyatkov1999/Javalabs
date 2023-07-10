package LAB6.Task1;

public class Client extends Human{
    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    protected Client(String firstName, String secondName, String bankName) {
        super(firstName, secondName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Client{" +
                "firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", bankName ='" + this.bankName + '\'' +
                '}');
    }

}
