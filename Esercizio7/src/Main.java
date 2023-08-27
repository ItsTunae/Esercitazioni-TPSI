public class Main {
    public static void main(String[] args) {

        Conto test = new Conto();
        Thread t1 = new Thread(new Padre(test));
        Thread t2 = new Thread(new Figlio(test));

        t1.start();
        t2.start();
    }
}