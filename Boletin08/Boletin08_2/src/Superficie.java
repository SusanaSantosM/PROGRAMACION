public class Superficie {
    double pi=3.1416;
    public float calcularAreaCuadrado(float lado){
        return lado*lado;
    }
    public float calcularAreaTriangulo(float base, float altura){
        return base*altura/2;
    }

    public double calcularAreaCirculo(float radio){
        return pi*Math.pow(radio,2);
    }
}
