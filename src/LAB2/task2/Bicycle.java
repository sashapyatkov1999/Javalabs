package LAB2.task2;

public class Bicycle {
    private String model;
    private int wheelSize;
    private int speedCount;
    private String frameMaterial;
    private double price;

    public Bicycle(){

    }

    public Bicycle(String model) {
        this.model = model;
    }

    public Bicycle(String model, int wheelSize, int speedCount, String frameMaterial, double price) {
        this.model = model;
        this.wheelSize = wheelSize;
        this.speedCount = speedCount;
        this.frameMaterial = frameMaterial;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getSpeedCount() {
        return speedCount;
    }

    public void setSpeedCount(int speedCount) {
        this.speedCount = speedCount;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", wheelSize=" + wheelSize +
                ", speedCount=" + speedCount +
                ", frameMaterial='" + frameMaterial + '\'' +
                ", price=" + price +
                '}';
    }
}
