public class Rectangulo extends FiguraGeometrica {
    private float altura;
    private float base;

    public Rectangulo(float altura,float base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void calcularArea() {
        area = (base * altura)/2;
    }
}
