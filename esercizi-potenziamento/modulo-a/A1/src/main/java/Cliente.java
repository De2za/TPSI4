import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

class Cliente extends Thread {
    private final Sportello sportello;
    private final int id;
    private final AtomicInteger serviti; //uso atomic integer perchè cosi posso evitare di sincronizzare ogni incremento o decremento, ho cercato come si usa la classe
    private final AtomicInteger rinunciatari;
    private final Random rnd = new Random();

    public Cliente(Sportello sportello, int id, AtomicInteger serviti, AtomicInteger rinunciatari) {
        this.sportello = sportello;
        this.id = id;
        this.serviti = serviti;
        this.rinunciatari = rinunciatari;
    }

    @Override
    public void run() {
        try {
            System.out.println("Cliente " + id + " arriva allo sportello");
            if (sportello.accedi(5000)) {
                System.out.println("Cliente " + id + " viene servito");
                int durata = 2000 + rnd.nextInt(2001);
                Thread.sleep(durata);
                sportello.rilascia();
                System.out.println("Cliente " + id + " ha terminato");
                serviti.incrementAndGet();
            } else {
                System.out.println("Cliente " + id + " rinuncia dopo 5 secondi");
                rinunciatari.incrementAndGet();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
