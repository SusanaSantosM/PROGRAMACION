import java.util.Scanner;

public class Boletin03_3 {

    public static void main(String[] args) {
        int cant100,cant20,cant5,cant1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la cantidad de billetes de 100");
        cant100 = sc.nextInt()*100;
        System.out.println("Inserte la cantidad de billetes de 20");
        cant20 = sc.nextInt()*20;
        System.out.println("Inserte la cantidad de billetes de 5");
        cant5 = sc.nextInt()*5;
        System.out.println("Inserte la cantidad de moedas de 1");
        cant1 = sc.nextInt();
        int total = cant100+cant20+cant5+cant1;
        System.out.println("Total = " + total + "€");
    }
}