public class Parcheggio {
    private int posteggi = 5;

    public synchronized void entra() throws InterruptedException {

        while (posteggi == 0) {
            wait();
        }   posteggi--;
        System.out.println(Thread.currentThread().getName() + " -> entrato");

    }

    public synchronized void esci() {
        posteggi++;
        notifyAll();
    }
}

