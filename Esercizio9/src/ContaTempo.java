public class ContaTempo implements Runnable{

    public void run() {

            System.out.println("Avvio Thread");
            try {

            Thread.sleep(10000);
            } catch (InterruptedException e) {}
            System.out.println(System.currentTimeMillis());
    }
}
