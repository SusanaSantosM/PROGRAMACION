public class Circulo {
    double radio;
    private final double PI = 3.14;

    public Circulo(double rad) {
        radio = rad;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double rad) {
        radio = rad;
    }

    public double calcularArea(){
        return PI*Math.pow(radio, 2);
    }

    public double calcularLonxitude(){
        return 2*PI*radio;
    }
}
