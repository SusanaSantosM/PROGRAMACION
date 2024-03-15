 abstract class FiguraGeometrica {
    protected float area;

    //Método abstracto
    public abstract void calcularArea();

    //Método concreto
    public void verArea(){
        System.out.println("área= "+area);
    }
}
