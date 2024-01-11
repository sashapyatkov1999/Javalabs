package LAB11;

public class Task4 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread thread = new Thread(new Printer(lock, "Поток 1"));
        Thread thread1 = new Thread(new Printer(lock, "Поток 2"));

        thread.start();
        thread1.start();
    }

    private static class Printer implements Runnable {
        private Object lock;
        private String name;

        public Printer(Object lock, String name) {
            this.lock = lock;
            this.name = name;
        }
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    System.out.println(name);
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
