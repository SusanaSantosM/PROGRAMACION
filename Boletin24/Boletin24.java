
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Boletin24 {

    public static void main(String[] args) {
        Libreria.librosIngresados();
        List<Libro>lista = new ArrayList<>(); 
        
    int opcion = 0;
   
    
    do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Escoge la opcion que deseas realizar: 
                                                              1.- Añadir libros
                                                              2.- Vender Libros
                                                              3.- Ver la lista de libros 
                                                              4.- Dar de baja un libro
                                                              5.- Consulta por un libro
                                                              6.- Salir"""));
        switch(opcion){
            case 1:
                Libreria.añadirLibro(JOptionPane.showInputDialog("Escribe el titulo del libro"),
                JOptionPane.showInputDialog("Escribe el autor"),
                JOptionPane.showInputDialog("Escribe el ISBN"),
                Float.parseFloat(JOptionPane.showInputDialog("Escribe el precio del libro")),
                Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de unidades del libro a ingresar")));
                break;
            case 2:
                Libreria.venderLibro(Integer.parseInt(JOptionPane.showInputDialog("Escriba cuantas unidades va a vender")), 
                        JOptionPane.showInputDialog("Escriba el ISBN del libro"));
                break;
            case 3:
                Libreria.verListaDeLibros();
                break;
            case 4:
                Libreria.darBajaLibros(JOptionPane.showInputDialog("Escribe el ISBN del libro"));
                break;
            case 5:
                Libreria.consultarLibro(JOptionPane.showInputDialog("Escribe el ISBN del libro"));
                break;
            case 6:
                opcion = JOptionPane.showConfirmDialog(null,"¿Seguro de salir del programa?");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error. Opción no válida");
                break;
        }
    }  while(opcion!=0); 
    System.exit(6);
    }
}
