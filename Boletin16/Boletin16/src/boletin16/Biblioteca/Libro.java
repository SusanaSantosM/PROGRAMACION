package boletin16.Biblioteca;

public class Libro extends Publicacion {
    private boolean prestado;

    public Libro (){
    }

    public Libro(boolean prestado, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return (super.toString()+ " Libro{" + "prestado=" + prestado + '}');
    }


}
