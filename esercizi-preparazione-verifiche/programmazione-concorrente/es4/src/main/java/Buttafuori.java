import java.util.Random;

public class Buttafuori {
    private final int tot = 120;
    private int occupants = 0;
    private final int minAge = 18;
    Random rd = new Random();
    public synchronized void controllo(int age){
        try {
            if (occupants >= tot){
                System.out.println("Cliente in attesa");
            }
            while (occupants >= tot) {
                wait();
            }
            if (age < minAge) {
                System.out.println(Thread.currentThread().getName() + "Minorenne, rimandato a casa");
                return;
            }

            occupants++;


        } catch (InterruptedException e) {
        }


    }
    public synchronized void uscita(){
     occupants--;
     notifyAll();
        System.out.println(Thread.currentThread().getName() + "Sta uscendo nel gas");
    }

}
