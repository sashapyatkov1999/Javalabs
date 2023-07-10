package LAB7;

import java.util.Scanner;

public class Plane {
    private Wing wing;

    public Plane () {
        wing = new Wing(100);
    }

    public class Wing {
        private int weight;
        public Wing(){

        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Wing(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

}
