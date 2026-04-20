public class Stazione {
    private String nome;
    private Binario[] binari = new Binario[5];
    int x;

    public

    public synchronized void occupa() {
        try {
            while(!isArrayFree()){
                wait();
            }
            for (int i = 0; i < binari.length; i++) {
                if (binari[i].isFree()) {
                    binari[i].occupy();
                    return;
                }
            }



        } catch (InterruptedException e) {

        }
    }

    private boolean isArrayFree() {
        x = 0;
        for (int i = 0; i < binari.length; i++) {
            if (binari[i].isFree()) {
                x++;
            }
            if(x>=1)return true;
        } return false;

    }
}




