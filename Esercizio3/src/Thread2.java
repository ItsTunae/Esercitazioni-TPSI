public class Thread2 extends Thread{
    public Thread2(){

        setName("Caio");
    }
    @Override
    public void run(){

        System.out.println("Sono il Thread "+getName());
        try {
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}
