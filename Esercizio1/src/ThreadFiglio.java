public class ThreadFiglio implements Runnable{
    private final char c;
    private int i = 0;
    public ThreadFiglio(char c){

        this.c = c;
    }
    public void run(){

        while(true){
            while(i < 50){
                System.out.print(c);
                try{

                    Thread.sleep(250);
                }catch (InterruptedException e){}
                i++;
            }
            System.out.println("\n");
            i=0;
        }
    }

}
