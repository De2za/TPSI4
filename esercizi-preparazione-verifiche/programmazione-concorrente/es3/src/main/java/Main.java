public class Main {
    public static void main (String[] args){
    SynchronizedBarrier s1 = new SynchronizedBarrier();

   for(int i = 0; i < 60; i++){
       Thread t = new Thread(new BarrierThread(s1));
       t.start();
   }





    }
}
