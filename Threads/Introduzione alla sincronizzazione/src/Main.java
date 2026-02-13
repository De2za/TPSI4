public class Main {
    public static void main (String[] args) throws InterruptedException{
    AddThread  addThread = new AddThread();
    AddThread addThread2 = new AddThread();

    addThread2.start();
    addThread.start();
    addThread.join();
    addThread2.join();

        System.out.println("Counter:" + addThread.counter.getCounter());
    }
}
