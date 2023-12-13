package Com.susana.Partes;

public class Teclado {
    private String marca;

    public Teclado(String marca) {
        this.marca = marca;
    }

    public Teclado() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + '}';
    }

}
