public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadFiglio('#'));
        Thread t2 = new Thread(new ThreadFiglio('*'));
        t1.start();
        t2.start();
    }
}