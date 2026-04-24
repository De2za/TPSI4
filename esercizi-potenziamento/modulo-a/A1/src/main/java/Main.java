import java.util.concurrent.atomic.AtomicInteger;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sportello sportello = new Sportello();
        AtomicInteger serviti = new AtomicInteger(0);
        AtomicInteger rincunciati = new AtomicInteger(0);
        Cliente[] clienti = new Cliente[8];

        for (int i = 0; i < clienti.length; i++) {
            clienti[i] = new Cliente(sportello, i + 1, serviti, rincunciati);
            clienti[i].start();
        }

        for (Cliente c : clienti) {
            c.join();
        }

        System.out.println("Clienti serviti: " + serviti.get());
        System.out.println("Clienti che hannno rinunciato: " + rincunciati.get());
    }

}