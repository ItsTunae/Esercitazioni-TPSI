public class Main {
    public static void main(String[] args) {
        int count = 0;

        Thread t1 = new Thread(new ContaTempo());

        t1.start();

    }
}