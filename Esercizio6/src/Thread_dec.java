import java.util.Random;

public class Thread_dec extends Thread {
    private Counter c;
    public Thread_dec(Counter c){

        this.c = c;
    }
    @Override
    public void run(){

        while(true){

            try {

                sleep(new Random().nextInt(250,750));
            }catch (InterruptedException e){}
            c.decrement();
            System.out.println(c.toString());
        }
    }
}
