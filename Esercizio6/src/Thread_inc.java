import java.util.Random;
public class Thread_inc extends Thread{

    private Counter c;
    public Thread_inc(Counter c){

        this.c = c;
    }
    @Override
    public void run(){

       while(true){

           try {

               sleep(new Random().nextInt(100,500));
           }catch (InterruptedException e){}
           c.increment();
           System.out.println(c.toString());
        }
    }
}
