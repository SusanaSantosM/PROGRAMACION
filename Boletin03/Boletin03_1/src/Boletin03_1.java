import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Boletin03_1 {
    public static void main(String[] args) {
     //Añadimos datos
        double precio,preciofinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el precio:");
        precio = sc.nextFloat();
        System.out.println("Inserte la rebaja a realizar:");
        preciofinal = sc.nextFloat();

    //Calculamos el descuento del precio
        int descuento = (int) (100-(preciofinal/precio*100));

    //Mostramos
        System.out.println("descuento: "+ descuento+"%");

    }
}