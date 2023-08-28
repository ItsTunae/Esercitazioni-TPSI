import java.util.Random;

public class CokeMachine {
    private static final int N = 50; //Capacità distributore
    private int count; //num. lattine presenti
    public CokeMachine(){

        count = N;
    }
    public synchronized void remove(){
        while(count == 0) {
            try {

                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            count -- ;
            System.out.println("Lattina prelevata, rimanenti: "+count);
            if(count==0){
                notifyAll();
        }
    }
    public synchronized void deposit(){

        count = N;
        System.out.println("Macchinetta rifornita, rimanenti: "+count);
            notifyAll();
            try{

                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
        }
    }
}
