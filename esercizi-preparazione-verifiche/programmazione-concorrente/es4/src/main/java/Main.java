public class Main {
    public static void main (String[] args){
        Buttafuori b1 = new Buttafuori();
        for(int i = 0; i < 400; i++){
            Thread t = new Thread(new Cliente(b1));
            t.start();

        }

    }
}
