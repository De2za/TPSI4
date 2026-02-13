public class Counter {
    private long counter;

    public void add(long value){
        //this.counter += value; -> += interpretato come tre righe separate
        long tmp = this.counter;
        tmp = tmp + value;
        this.counter = tmp;
    }
    public long getCounter() {
        return counter;
    }
}
