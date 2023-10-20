import java.util.Scanner;
public class Boletin07_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sc.nextLine();
        System.out.println(" nome1 : ");
        String nome1 = sc.nextLine();

        System.out.println("pezo1 : ");
        double pezo1 = sc.nextDouble();

        System.out.println("pezo2 : ");
        double pezo2 = sc.nextDouble();

        System.out.println(pezo1-pezo2+ " es a diferenza da os pezos e");

    }
}