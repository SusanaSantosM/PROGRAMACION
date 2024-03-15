
public class Main {
    public static void main(String[] args) {
        //Vemos el área del Círculo
        Circulo circulo = new Circulo(25);
        circulo.calcularArea();
        circulo.verArea();

        //Vemos el área del Rectángulo
        Rectangulo rectangulo = new Rectangulo(4f,10f);
        rectangulo.calcularArea();
        rectangulo.verArea();
    }
}