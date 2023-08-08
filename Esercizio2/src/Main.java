import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        HoldInteger obj = new HoldInteger();
        Calcolo c = new Calcolo(obj);

        System.out.printf("Inserire, di seguito, due numeri interi per effetturane la somma");
        System.out.println("\nvalore 1: ");
        num = input.nextInt();
        obj.setValue1(num);
        System.out.println("\nValore 2: ");
        num = input.nextInt();
        obj.setValue2(num);
        c.start();
    }
}