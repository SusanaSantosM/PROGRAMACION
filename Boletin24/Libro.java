
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int unidad;

    public Libro(String titulo, String autor, String ISBN, float precio, int unidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.unidad = unidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidad(int unidades) {
        this.unidad = unidades;
    }

    @Override
    public String toString() {
        return "titulo:" + titulo + "\t autor:" + autor + "\t ISBN:" + ISBN + "\t precio:" + precio + "\t unidades:" + unidad ;
    }
    
    public void actualizarUnidades(int unidades){
        unidad -= unidades;       
    } 
}
