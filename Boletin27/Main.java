import javax.swing.*;

public class Main {
    public static Libreria libreria = new Libreria();

    public static void main(String[] args) {

        //Menú del programa
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija la opción que desea realizar:" +
                    "\n 1.- Añadir un libro" +
                    "\n 2.- Consultar por un libro" +
                    "\n 3.- Ver lista de libros" +
                    "\n 4.- Borrar un libro" +
                    "\n 5.- Modificar precio" +
                    "\n 6.- Salir"));
            switch (opcion){
                case 1:
                    libreria.añadirLibro(JOptionPane.showInputDialog("Ingrese el titulo el libro"),
                            JOptionPane.showInputDialog("Ingrese el autor"),
                            Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio")),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese las unidades")));
                    break;
                case 2:
                    String titulo = JOptionPane.showInputDialog("Introduce el titulo del libro que deseas buscar");
                    libreria.consultarLibro(titulo);
                    break;
                case 3:
                    libreria.verListaDeLibros();
                    break;
                case 4:
                    libreria.borrarLibro();
                    break;
                case 5:
                    float precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo precio"));
                    libreria.modificarPrecio(precio);
                    break;
                case 6:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Error!, La opcion es inválida. Intente de nuevo");
                    break;
            }
        }while(opcion < 7);
    }
}