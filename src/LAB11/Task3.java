package LAB11;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                synchronized (counter){
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
                counter.notify();
                }
            });
            threads[i].start();
        }
        synchronized (counter) {
            while (counter.getCount() != threads.length * 1000) {
                counter.wait();
            }
            System.out.println(counter.getCount());
    }
}
    static class Counter {
        private int count = 0;
        public synchronized void increment() {
            count = count + 1;
        }
        public synchronized int getCount() {
            return count;
        }
        //CountDownLatch реализовать еще через него
    }
}
