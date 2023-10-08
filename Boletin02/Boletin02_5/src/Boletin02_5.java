import java.util.Scanner;

public class Boletin02_5 {
    public static void main(String[] args) {
        //Insertamos datos
        double NM,distancia;
         //final int VALOR=1852;

        Scanner sc = new Scanner(System.in);
        System.out.println("inserta numero de NM a convertir :");
        NM = sc.nextDouble();

        //Calculamos la distancia en metros
        distancia=1852*NM;
           //Tambien podria ser: distancia=NM*VALOR;

        //Mostramos
        System.out.println("distancia="+distancia+"metros");

        //Sin declarar la variable metros
        //System.out.println(dist+" millas = "+(dist*VALOR)+" m");
    }
}