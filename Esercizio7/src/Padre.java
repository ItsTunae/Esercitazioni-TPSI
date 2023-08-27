import java.util.Random;

public class Padre implements Runnable{

    private Conto c;
    public Padre(Conto c){

        this.c = c;
    }
    public void run(){

        while(true){
            try{

                Thread.sleep(new Random().nextInt(500,1000));
            }catch(InterruptedException e){}
            c.deposita();
            System.out.println(c.toString());
        }
    }
}

