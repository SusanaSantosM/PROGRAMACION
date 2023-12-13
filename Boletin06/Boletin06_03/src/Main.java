
public class Main {
    public static void main(String[] args) {
        Circulo cir = new Circulo();
        cir.setRadio(20);
        System.out.println("Area del circulo = "+cir.calcularArea());
        System.out.println("Lonxitude del circulo = "+cir.calcularLonxitude());

        //Constructor parametrizado
        Circulo ob = new Circulo(50);
        System.out.println("Area del circulo = "+ob.calcularArea());
        System.out.println("Lonxitude del circulo = "+ob.calcularLonxitude());

    }
}