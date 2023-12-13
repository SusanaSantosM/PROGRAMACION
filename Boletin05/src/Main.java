import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducimos los kilometros: ");
        float km = sc.nextFloat();
        System.out.println("Introducimos los litros: ");
        float litros = sc.nextFloat();
        System.out.println("introducimos la velocidad media: ");
        float vMed = sc.nextFloat();
        System.out.println("Introducimos el precio de la gasolina: ");
        float pGas = sc.nextFloat();

        //Constructor
        Consumo consume = new Consumo();
        consume.setLitros(50);
        consume.setpGas(1.57f);


        //Constructor parametrizado
        Consumo consumo = new Consumo(km,litros,vMed,pGas);

        //Visualizamos
        System.out.println("Consumo medio = "+consumo.consumoMedio()+ " litros/km");
        System.out.println("Velocidad media = "+consumo.getvMed()+ " km/h");
        System.out.println("Litros cosumidos = "+consumo.getLitros()+ " litros");


    }
}