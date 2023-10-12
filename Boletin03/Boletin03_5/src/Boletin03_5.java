import java.util.Scanner;
public class Boletin03_5 {
    public static void main(String[] args) {
        double sueldofijo,ventas,comision = 0.05,km,kilometraje = 2,dias,dieta = 30,IRPF = 0.18,ss = 36;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte el sueldo fijo:");
        sueldofijo = sc.nextDouble();
        System.out.println("Inserte total de las ventas:");
        ventas = sc.nextDouble();
        System.out.println("Inserte los kilometros realizados:");
        km = sc.nextDouble();
        System.out.println("Inserte el numero de dias donde desplazo:");
        dias = sc.nextDouble();

        //Operaciones
        double comisiont = ventas*comision;
        double kilometrajet = km * kilometraje;
        double dietast = dias*dieta;

        double sueldobruto = sueldofijo+comisiont+kilometrajet+dietast;

        double irpftasa = sueldobruto*IRPF;

        double sueldoneto = sueldobruto-irpftasa-ss;

        //Mostrar resultado
        System.out.println("Sueldo bruto: "+sueldobruto+"\nSueldo liquido: "+sueldoneto);

    }
}