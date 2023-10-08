import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Boletin02_3 {
    public static void main(String[] args) {
    //Calcular el cambio de euros a dolares
        double euros,dolares,cambio;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese euros :");
        euros = sc.nextDouble();
        System.out.println("ingrese el cambio :");
        cambio = sc.nextDouble();

    //Hacemos el cambio
        dolares=euros*cambio;

    //Mostramos
        System.out.println(euros+"euros="+dolares+"dolares");
        //Sin declarar la variable dolares;
        //System.out.println(euros+"euros="+(euro*cambio)+)
    }
}