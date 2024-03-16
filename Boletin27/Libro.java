import java.io.Serializable;

public class Libro implements Serializable {
    String titulo;
    String autor;
    float precio;
    int unidades;

    //Constructores
    public Libro() {
    }

    public Libro(String nombre, String autor, float precio, int unidades) {
        this.titulo = nombre;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro " + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", precio: " + precio +
                ", unidades: " + unidades;
    }
}
