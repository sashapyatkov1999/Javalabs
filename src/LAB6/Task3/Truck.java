package LAB6.Task3;

public class Truck extends Car {
    private int countWeals;
    private int maxWeight;

    public Truck(int w, String m, String c, float s, int countWeals , int maxWeight) {
        super(w, m, c, s);
        this.countWeals = countWeals;
        this.maxWeight = maxWeight;
    }

    public int getCountWeals() {
        return countWeals;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void setCountNewWeals(int countWeals) {
        this.countWeals = countWeals;
        System.out.println(countWeals);
    }

}
