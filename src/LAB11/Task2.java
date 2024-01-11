package LAB11;

public class Task2 {
    public static void main(String[] args)  {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread.State stateBefore = thread.getState();
        System.out.println("Состояние до запуска: " + stateBefore);
        thread.start();
        Thread.State stateAfterStart = thread.getState();
        System.out.println("Состояние после запуска: " + stateAfterStart);
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.State stateAfter = thread.getState();
        System.out.println("Состояние после :" + stateAfter);
    }
}
