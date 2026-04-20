import java.util.Random;
public class Auto implements Runnable {
    Random rd = new Random();
    Parcheggio p1;

    public Auto(Parcheggio p1) {
        this.p1 = p1;
    }

    public void run() {
        try {
            Thread.sleep(2 + rd.nextInt(5 - 2 + 1));
            p1.entra();
            Thread.sleep(3 + rd.nextInt(8 - 3 + 1));
            p1.esci();
            System.out.println(Thread.currentThread().getName() + " -> uscito");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
