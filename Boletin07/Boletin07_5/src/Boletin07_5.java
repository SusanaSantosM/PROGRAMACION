import java.util.Scanner;
public class Boletin07_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introducir numero 1: ");
        int num1 = sc.nextInt();
        System.out.println(" Introducir numero 2: ");
        int num2 =  sc.nextInt();
        System.out.println(" Introducir numero 3: ");
        int num3 = sc.nextInt();

        Numero ob = new Numero();
        ob.setNumero(num1,num2,num3);
    }
}