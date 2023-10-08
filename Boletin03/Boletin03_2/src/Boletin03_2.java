import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Boletin03_2 {
    public static void main(String[] args) {
        //Ingresamos datos
        double gradosC,gradosF,gradosK;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la cantidad de grados Cº");
        gradosC = sc.nextFloat();

        //Calculamos en grados F y K
        gradosF = gradosC * 9/5 +32;
        gradosK = gradosC+273.15;

        //Mostramos
        System.out.println(gradosC+"Cº = "+gradosF+"Fahrenheit\n"+gradosC+"Cº = "+gradosK+"Kelvin");

    }
}