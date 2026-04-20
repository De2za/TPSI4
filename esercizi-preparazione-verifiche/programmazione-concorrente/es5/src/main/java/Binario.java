public class Binario {
    private boolean status = true;
    //binario vuoto di default

    public void occupy(){
        status = false;
    }
    public void free(){
        status = true;
    }

    public boolean isFree(){
        return status;
    }
}
