import java.util.Random;

public class CokeMachine {
    private static final int N = 50; //Capacità distributore
    private int count; //num. lattine presenti
    public CokeMachine(){

        count = 50;
    }
    public synchronized void remove(){
        while(count == 0){
            try{

                wait(5000);
            }catch (InterruptedException e){
                System.out.println("Macchinetta vuota");
            }
            count -- ;
            System.out.println(count);
            notifyAll();
        }
    }
    public synchronized void deposit(){
        while(count > 0){
            try{

                wait();
            }catch (InterruptedException e){
                System.out.println("Macchinetta piena");
            }
            count = N;
            notifyAll();
        }
    }
    public String toString(){

        return "Lattine presenti : "+count+" su "+N;
    }
}
