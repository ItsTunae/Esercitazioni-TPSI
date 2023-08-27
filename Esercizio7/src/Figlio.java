import java.util.Random;

public class Figlio implements Runnable{

    private Conto c;
    public Figlio(Conto c){

        this.c = c;
    }
    public void run(){

        while(true){
            try{

                Thread.sleep(new Random().nextInt(1000,2000));
            }catch (InterruptedException e){}
            c.prelievo();
            System.out.println(c.toString());
        }
    }
}
