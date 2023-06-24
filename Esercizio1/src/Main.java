public class Main {
    public static void main(String[] args) {

        //Creazione dei due Thread figlio1 e figlio 2
        ThreadFiglio figlio1 = new ThreadFiglio("*");
        ThreadFiglio figlio2 = new ThreadFiglio("#");

        figlio1.run();
        figlio2.run();
    }
}