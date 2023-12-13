import java.util.Scanner;

public class Boletin08_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa nombre del articulo: ");
    String nombre = sc.nextLine();

    System.out.println("Ingresa las ventas anuales del articulo: ");
    int ventas = sc.nextInt();

        Productos ob = new Productos();
        ob.mostrarProductos(nombre,ventas);
    }
}