public class ThreadFiglio extends Thread {
    private String nome;

    public ThreadFiglio(String nome) {

        this.nome = nome;
    }

    @Override
    public void run() {
            int count = 0;  //variabile contatore
            while (count <= 50) {

                System.out.println(nome + "" + count);  //stampa del simbolo e del conteggio di quante volte è stato stampato
                count++;
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e){}
            }
            System.out.println("\nRitorno a capo.");    //dopo cinquanta stampe, torna a capo
            Thread.interrupted();   //termino il Thread
    }
}
