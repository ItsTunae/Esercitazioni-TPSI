import java.util.Random;

public class Rifornitore implements Runnable{
    private CokeMachine c;

    public Rifornitore(CokeMachine c){

        this.c = c;
    }
    public void run(){

        while(true) {

            c.deposit();
        }
    }
}
