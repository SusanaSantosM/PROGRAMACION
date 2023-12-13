import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Introduce tu nombre: ");
        nome = sc.nextLine();

        String apelido;
        System.out.println("Introduce tu apelido: ");
        apelido = sc.nextLine();

        String fechaNacimiento;
        System.out.println("Introduce tu fecha de nacimiento: ");
        fechaNacimiento = sc.nextLine();

        System.out.println("Hola " +nome+"\n"+apelido);
        System.out.println("Tu cumpleaños es el " +fechaNacimiento);

    }
}