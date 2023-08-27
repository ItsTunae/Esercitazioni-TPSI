import java.util.Random;
import java.util.Scanner;

public class Conto {
    private int conto;
    public Conto(){

        conto = 10000;
    }
    public synchronized void deposita(){
        while(conto > 0){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        conto = 10000;
    }
    public synchronized void prelievo(){
        while(conto == 0){
            try{
                wait(5000);
            }catch(InterruptedException e){}
        }
        conto-=(new Random().nextInt(100,5000));
        notify();
    }
    public String toString(){

        return "Conto pari a "+conto;
    }
}
