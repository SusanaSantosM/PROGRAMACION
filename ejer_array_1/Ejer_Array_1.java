
package ejer_array_1;

import javax.swing.JOptionPane;

public class Ejer_Array_1 {

    public static void main(String[] args) {
        String alumno;
        alumno = JOptionPane.showInputDialog("Ingrese nombre completo del alumno");
        
        Calificaciones curso = new Calificaciones();
        curso.ingresaNotas();
        curso.sumaNotaMedia();
        curso.notaMaxMin();
    }
    
}
