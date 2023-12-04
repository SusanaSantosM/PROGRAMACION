package Biblioteca;

public class Revista extends Publicacion {
    private int numero;

    public Revista() {
    }

    public Revista(int numero, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return(super.toString()+" Revista{" + "numero=" + numero + '}');
    }
}
