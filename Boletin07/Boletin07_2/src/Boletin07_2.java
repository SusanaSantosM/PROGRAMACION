import java.util.Scanner;
public class Boletin07_2 {
    public static void main(String[] args) {

        Operaciones ob = new Operaciones();

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce num1: ");
        System.out.println("Introduce num2: ");
        ob.verOperaciones(sc.nextShort(), sc.nextShort());
    }

}