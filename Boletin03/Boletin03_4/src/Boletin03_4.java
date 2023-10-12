import java.util.Scanner;
public class Boletin03_4 {
    public static void main(String[] args) {

        int total,cant100 = 0,cant20 = 0,cant5 = 0,cant1 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la cantidad total de euros");
        total = sc.nextInt();
        if (total>=100){
            cant100 = total/100;
            total = total%100;
        }
        if (total>=20){
            cant20 = total/20;
            total = total%20;
        }
        if (total>=5){
            cant5 = total/5;
            total = total%5;
        }
        if (total>=1){
            cant1 = total/1;
        }
        System.out.println("Desglose: Billetes de 100 euros = " + cant100);
        System.out.println("Desglose: Billetes de 20 euros = "+cant20);
        System.out.println("Desglose: Billetes de 5 euros = "+cant5);
        System.out.println("Desglose: Monedas de 1 euros = "+cant1);
    }
}