public class ThreadCheck implements Runnable{
    private Thread A;
    public ThreadCheck(Thread A){

        this.A = A;
    }
    public void run(){

        while(A.isAlive()){
            System.out.println("Processo Figlio vivo");
            try {

                Thread.sleep(500);
            }catch (InterruptedException e){}
        }
        System.out.println("Processo figlio Terminato");
    }
}
