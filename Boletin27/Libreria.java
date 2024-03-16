import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Libreria implements Serializable{
    //Creamos una colección de libros
    private static ArrayList<Libro> listaLibros = new ArrayList<>();


    //Constructores
    public Libreria() {
    }

    public Libreria(ArrayList<Libro> listaLibros) {
        Libreria.listaLibros = listaLibros;
    }


    //Getter
    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }


    //Métodos que usaremos para modificar la colección
    public void añadirLibro(String titulo, String autor, float precio, int unidades) {
        listaLibros.add(new Libro(titulo, autor, precio, unidades));
    }

    public void consultarLibro(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equals(titulo)) {
                JOptionPane.showMessageDialog(null, "Titulo del libro " +listaLibros.get(i).getTitulo() +
                        "\n Autor: " + listaLibros.get(i).getAutor() + "\n Precio: " + listaLibros.get(i).getPrecio() +
                        "\n Unidades: " + listaLibros.get(i).getUnidades());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "El libro " + titulo + " no se encuentra en la lista.");
        }
    }

    public void verListaDeLibros() {
        for (int i = 0; i < listaLibros.size(); i++) {
            JOptionPane.showMessageDialog(null, (i + 1) + "" + listaLibros.get(i).toString());
        }
    }

    public void borrarLibro() {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getUnidades() == 0) {
                listaLibros.remove(i);
            }
        }
    }

    public void modificarPrecio (float precio){
        verListaDeLibros();
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Intoduce un número indice "))-1;
        listaLibros.get(indice).setPrecio(precio);
    }

    //Creamos las excepciones
    public void guardarDatos(Libreria lib){
        try {
            FileOutputStream fileOut = new FileOutputStream("lib.ser");
            ObjectOutputStream ob = new ObjectOutputStream(fileOut);
            ob.writeObject(lib);
            ob.close();
            fileOut.close();
            JOptionPane.showMessageDialog(null,"Objeto serializado guardado en Lib.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Libreria cargarDatos(Libreria lib){
        try{
            FileInputStream fileIn = new FileInputStream("libreria.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            lib = (Libreria) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"Objeto desserializado"+lib);
        return lib;
    }
}
