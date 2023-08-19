public class Counter {
    public int count = 0;
    public synchronized void increment(){
        while (count == 10){
            try {
                wait(2000);
            }catch (InterruptedException e){}
        }
        count ++;
        notifyAll();
    }
    public synchronized void decrement(){
        while (count == 0){
            try {
                wait(2000);
            }catch (InterruptedException e){}
        }
        count --;
        notifyAll();
    }
    public String toString(){

        return String.valueOf(count);
    }
}
