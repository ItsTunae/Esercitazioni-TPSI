public class Main {
    public static void main(String[] args) {

        CokeMachine test = new CokeMachine();
        Thread t1 = new Thread(new Rifornitore(test));
        Thread t2 = new Thread(new Utente(test));

        t1.start();
        t2.start();
    }
}