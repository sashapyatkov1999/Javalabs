package LAB6.Task1;

public abstract class Human {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    private String secondName;

    protected Human(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public abstract void printInfo();
}
