import java.util.Random;

public class Rifornitore implements Runnable{

    private CokeMachine c;
    public Rifornitore(CokeMachine c){

        this.c = c;
    }
    public void run(){

        while(true) {
            try {

                Thread.sleep(new Random().nextInt(500, 1000));
            } catch (InterruptedException e) {
            }
            c.deposit();
            System.out.println("Macchinetta riempita");
        }
    }
}
