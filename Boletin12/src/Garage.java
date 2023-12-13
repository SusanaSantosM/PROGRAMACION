import java.util.Scanner;
public class Garage {
    public static int numCoche = 0;
    private Coche matricula;
    private Coche marca;

    public Garage() {
    }

    public Garage(Coche matricula, Coche marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public static int getNumCoche() {
        return numCoche;
    }

    public static void setNumCoche(int numCoche) {
        Garage.numCoche = numCoche;
    }

    public Coche getMatricula() {
        return matricula;
    }

    public void setMatricula(Coche matricula) {
        this.matricula = matricula;
    }

    public Coche getMarca() {
        return marca;
    }

    public void setMarca(Coche marca) {
        this.marca = marca;
    }

    public static final int MAX_CAPACIDAD=5;

    public void aparcarCoche(String matricula, String marca, int tiempoAparcamiento){
        if(numCoche<MAX_CAPACIDAD){
            System.out.println("Plazas disponibles :"+numCoche);
            double precio = calcularPrecio(tiempoAparcamiento);
            darFactura(matricula, marca, tiempoAparcamiento, precio);
            numCoche++;
        } else if(numCoche==MAX_CAPACIDAD){
            System.out.println("Completo");
        }
    }

    private double calcularPrecio(int tiempoAparcamiento){
        double precio;
        if(tiempoAparcamiento<=3){
            precio = 1.5;
        }else {
            precio = 1.5+(tiempoAparcamiento-3)*0.20;
        }
        return precio;
    }

    private void darFactura(String matricula,String marca, int tiempoAparcamiento, double precio){
        System.out.println("FACTURA");
        System.out.println("MATRICULA DE VEHICULO: "+matricula);
        System.out.println("TIEMPO: " +tiempoAparcamiento+ "horas");
        System.out.println("PRECIO: "+precio+ "€");

        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL DINERO: ");
        double dineroRecibido=sc.nextDouble();

        double cambio = dineroRecibido - precio;
        System.out.println("SU CAMBIO: "+cambio+ "€");

        System.out.println("\nGRACIAS POR UTILIZAR NUESTRO ESTACIONAMIENTO");
    }
}
