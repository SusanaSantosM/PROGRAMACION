
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Libreria {
    private static List<Libro>lista = new ArrayList<>(); 

    public static List<Libro> getLista() {
        return lista;
    }

    public static void setLista(List<Libro> lista) {
        Libreria.lista = lista;
    }
    
    public static void librosIngresados(){
        lista.add(new Libro("Harry Potter y el prisionero de Azkaban","J.K. Rowlling","cdEngland",35.50f,50));
        lista.add(new Libro("Harry Potter y el caliz de fuego","J.K. Rowlling","cdEngland2",40f,25));
        lista.add(new Libro("Harry Potter y el misterio del principe","J.K. Rowlling","cdEngland3",36.90f,30));
    }

    public static void añadirLibro(String titulo,String autor, String ISBN, float precio, int unidades){
        lista.add(new Libro(titulo,autor,ISBN,precio,unidades));
    }
    
    public static void venderLibro(int unidades, String ISBN){
                
        try{
            Libro libroAVender = Libreria.buscarLibro(lista, ISBN);
            
            if(libroAVender==null){
                throw new ExcepcionNull("El código ISBN no fue encontrado");
            }else{
                libroAVender.actualizarUnidades(unidades);
                Libreria.darBajaLibros(ISBN);
            }
        
        }catch (ExcepcionNull e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void verListaDeLibros(){
        for(int i=0; i<lista.size();i++){
            JOptionPane.showMessageDialog(null,"Libro: "+i+"\n"+lista.get(i).getTitulo()+"\n Autor: "+lista.get(i).getAutor()+"\n Código: "+lista.get(i).getISBN()+"\n Precio: "+lista.get(i).getPrecio()+"\n Unidades: "+lista.get(i).getUnidad());
        }
    }
    
    public static void darBajaLibros( String ISBN){
        Libro libro = Libreria.buscarLibro(lista, ISBN);
        if (libro.getUnidad()==0){
            lista.removeIf(i -> i.getISBN().equals(ISBN));
            JOptionPane.showMessageDialog(null, "El libro ha sido borrado.");
        }else{
            JOptionPane.showMessageDialog(null, "El numero de unidades que queda es de "+libro.getUnidad());
        }    
    }
    
    public static Libro buscarLibro(List<Libro>lista, String ISBN){
        for(Libro list : lista){
            if(list.getISBN().equals(ISBN)){
                JOptionPane.showMessageDialog(null,"Titulo: "+list.getTitulo()+"\n Autor: "+ list.getAutor()+"\n Precio: "+list.getPrecio()+"\n Unidades: "+list.getUnidad());  
                return list;
            }
        }
        return null;
    }
    
    public static void consultarLibro(String ISBN){
        try{
            Libro libroAVender = Libreria.buscarLibro(lista, ISBN);
            
            if(libroAVender==null){
                throw new ExcepcionNull("ISBN no encontrado");
            }else{
                JOptionPane.showMessageDialog(null, libroAVender);
            }
            
        }catch (ExcepcionNull e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
