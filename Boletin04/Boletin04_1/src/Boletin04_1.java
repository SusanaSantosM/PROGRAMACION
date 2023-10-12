// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Boletin04_1 {
    public static void main(String[] args) {
        //Con constructor por defecto
        Libro oxbLIB= new Libro();

        oxbLIB.darTitulo("Hamlet");
        String va = oxbLIB.devolverTitulo();
        System.out.println("titulo: "+va);

        oxbLIB.darAutor("Shakespeare");
        System.out.println("autor: "+ oxbLIB.devolverAutor());

        oxbLIB.darAno(1602);
        System.out.println("ano: "+ oxbLIB.devolverAno());

        oxbLIB.darNumPaginas((short)200);
        System.out.println("numPaginas: "+ oxbLIB.devolverNumPaginas());

        oxbLIB.darValoracion(10.4f);
        System.out.println("valoracion: "+ oxbLIB.devolverValoracion());

        // Con constructor parametrizado
        Libro oxbLIB2 = new Libro("Hamlet", "Shakespeare",1602,(short)200,10.4f);
        System.out.println();
        oxbLIB.mostrar();

    }
}