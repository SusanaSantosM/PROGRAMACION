import java.util.Scanner;
public class Boletin12 {
    public static void main(String[] args) {
        Garage ob = new Garage();
        Coche obx =  new Coche();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto: ");
        String marca = sc.nextLine();


        System.out.println("Ingrese la matricula del auto: ");
        String matricula = sc.nextLine();

        ob.aparcarCoche(matricula, marca, 0);
    }
}