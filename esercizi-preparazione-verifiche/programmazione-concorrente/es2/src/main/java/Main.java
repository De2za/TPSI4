public class Main {
    public static void main(String[] args){
    Parcheggio p1 = new Parcheggio();
    for(int i = 0; i < 10; i++){
        Thread t1 = new Thread(new Auto(p1));
        t1.start();
    }


    }
}
