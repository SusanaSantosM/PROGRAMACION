import java.util.Scanner;

public class Boletin08_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la figura");
        String figura = sc.nextLine();

        Superficie ob = new Superficie();

        switch(figura) {
            case "cuadrado":
                System.out.println("Introducir medida del lado: ");
                float lado = sc.nextFloat();
                System.out.println(ob.calcularAreaCuadrado(lado));
                break;

            case "triangulo":
                System.out.println("Introducir medida de la base: ");
                float base = sc.nextFloat();
                System.out.println("Introducir medida de la altura: ");
                float altura = sc.nextFloat();
                System.out.println(ob.calcularAreaTriangulo(base,altura));
                break;

            case "circulo" :
                System.out.println("Introducir medida del radio: ");
                float radio = sc.nextFloat();
                System.out.println(ob.calcularAreaCirculo(radio));
                break;

            default:
                System.out.println("Función incorrecta.");
                break;
        }
    }
}