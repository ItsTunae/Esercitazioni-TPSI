import java.util.Random;

public class Utente implements Runnable{
    private CokeMachine c;

    public Utente(CokeMachine c){

        this.c = c;
    }
    public void run(){

        while(true){
            c.remove();
            try{

                Thread.sleep(new Random().nextInt(1000,2000));
            }catch (InterruptedException e){

                Thread.currentThread().interrupt();
            }
        }
    }
}
