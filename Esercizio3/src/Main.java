public class Main {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println("Sono il Thread Main\n Avvio dei due Thread");
        t1.start();
        t2.start();
    }
}