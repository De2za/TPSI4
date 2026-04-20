import java.util.Random;

public class Cliente implements Runnable {
    Random rd = new Random();
    Buttafuori b1;
    int age;
    public Cliente (Buttafuori b1){
        this.b1 = b1;
        age = 15 + rd.nextInt(37 - 15 + 1);
    }

    public void run(){
       try {
           b1.controllo(age);
           if (age < 18){return;}
           System.out.println(Thread.currentThread().getName() + "Sta Ballando)");
           Thread.sleep(rd.nextInt(10000));
           b1.uscita();
       } catch (InterruptedException e) {
           Thread.currentThread().interrupt();
       }

    }

}
