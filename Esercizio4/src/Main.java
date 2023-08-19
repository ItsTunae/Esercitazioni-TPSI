public class Main {
    public static void main(String[] args) {

        Thread figlio = new Thread(new TestThread ("luigi",5));
        Thread padre = new Thread(new ThreadCheck(figlio));

        figlio.start();
        padre.start();
        }
    }
