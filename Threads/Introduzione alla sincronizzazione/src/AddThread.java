import java.util.concurrent.Semaphore;

public class AddThread extends Thread {

    static Counter counter = new Counter();
    static final Semaphore sem = new Semaphore(1); // un sem è un intero, se è maggiore di zero non entra nessuno, se è zero la strada è aperta.

    @Override
    public void run(){
        for (int i = 0; i < 100000000 ; i++)
            try {
                sem.acquire();
                counter.add(1);
                sem.release();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
                sem.release();
                break;
            }
    }

}
