public class SynchronizedBarrier {
    private final int soglia = 40;
    private int threadAttesa = 0;
    public synchronized void arrivaBarriera(){
    try {
        threadAttesa++;
        //in alternativa if(threadAttesa == soglia){notifyAll()}
        while(threadAttesa < soglia) {  System.out.println( Thread.currentThread().getName() + "attesa raggiungimento soglia");
            wait();}
        notifyAll();
        System.out.println( Thread.currentThread().getName() + "riprende a lavorare");}
         catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    }


}
