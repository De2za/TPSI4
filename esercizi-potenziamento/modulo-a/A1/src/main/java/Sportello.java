import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Sportello {
    private int cassieriLiberi = 2;

    public synchronized boolean accedi(long timeoutMs) throws InterruptedException {
        long scadenza = System.currentTimeMillis() + timeoutMs; //cercato, non sapevo come calcolare il tempo attuale per poi usare 5 secondi
        while (cassieriLiberi == 0) {

            long rimanente = scadenza - System.currentTimeMillis();
            if (rimanente <= 0) {
                return false;
            }
            wait(rimanente); //cercato anche il fatto di come far rilasciare il lock in modo tale che un'altro thread possa accedere al metodo rilascia
        }
        cassieriLiberi--;
        return true;
    }

    public synchronized void rilascia() {
        cassieriLiberi++;
        notifyAll();
    }
}