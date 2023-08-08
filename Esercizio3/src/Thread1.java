public class Thread1 extends Thread{
    public Thread1(){

        setName("Pippo");
    }
    @Override
    public void run(){

        System.out.println("Sono il Thread "+getName());
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}
