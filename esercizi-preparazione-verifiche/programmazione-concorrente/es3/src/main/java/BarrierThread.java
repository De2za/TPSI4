import java.util.Random;
public class BarrierThread implements Runnable {

    SynchronizedBarrier s1;
    Random rd = new Random();
    public BarrierThread(SynchronizedBarrier s1){
        this.s1 = s1;
    }

    public void run(){
        try {
            Thread.sleep(2 + rd.nextInt(5 - 2 + 1));
            s1.arrivaBarriera();
        } catch (InterruptedException e){
        Thread.currentThread().interrupt();}

    }
}
