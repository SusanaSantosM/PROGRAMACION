public class Libro {
    //atributos

    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;


    //contructor por defecto
    public Libro(){
    }

    //contructor parametrizado
    public Libro(String t,String a, int n,short p, float v){
        this.titulo = t;
        this.autor = a;
        this.ano = n;
        this.numPaginas = p;
        this.valoracion = v;
    }

    //metodos de acceso para los atributos
    public void darTitulo(String t){
        this.titulo = t;
    }
    public String devolverTitulo(){
        return titulo;
    }
    public void darAutor(String a){
        this.autor = a;
    }
    public String devolverAutor(){
        return autor;
    }
    public void darAno(int n){
        this.ano = n;
    }
    public int devolverAno(){
        return ano;
    }
    public void darNumPaginas(short p){
        this.numPaginas = p;
    }
    public short devolverNumPaginas(){
        return numPaginas;
    }
    public void darValoracion(float v){
        this.valoracion = v;
    }
    public float devolverValoracion(){
        return valoracion;
    }
    //Metodo para mostrar
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " +ano);
        System.out.println("NumPaginas: " +numPaginas);
        System.out.println("Valoracion: " +valoracion);
    }
}


