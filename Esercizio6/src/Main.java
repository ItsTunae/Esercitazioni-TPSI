public class Main {
    public static void main(String[] args) {

        Counter test = new Counter();
        Thread_inc t1 = new Thread_inc(test);
        Thread_dec t2 = new Thread_dec(test);

        t1.start();
        t2.start();
    }
}