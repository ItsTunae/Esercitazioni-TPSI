public class TestThread implements Runnable{
    private String name;
    private int A;
    private int moneta;
    private int n;
    private int test;
    public TestThread(String name, int test){

        this.name = name;
        this.test = test;

    }
    public void run(){

        System.out.println("Giochiamo a 50/50, prova a indovinare...");
        while(n < test) {
            moneta = ((int)(Math.random() * 10));
            if (moneta < 5) {

                System.out.println("E' uscita testa!");
            } else {

                System.out.println("E' uscita croce");
            }
            try {

                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            n++;
        }
    }
}
