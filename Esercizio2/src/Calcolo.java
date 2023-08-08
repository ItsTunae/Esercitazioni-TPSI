public class Calcolo extends Thread{
    public HoldInteger h;
    public Calcolo(HoldInteger h){

        this.h = h;
    }
    @Override
    public void run(){
        int result = 0;

        result = h.getValue1() + h.getValue2();
        System.out.println("risultato = "+result);
    }
}
