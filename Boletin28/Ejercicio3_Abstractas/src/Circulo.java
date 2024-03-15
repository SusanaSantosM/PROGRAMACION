public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = (float) (Math.PI * (radio * radio));
    }
}
