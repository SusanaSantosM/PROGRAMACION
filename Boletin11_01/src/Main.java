import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean jugarDeNuevo = true;

        while(jugarDeNuevo){
            int numeroAdivinar = (int)(Math.random()*50)+1;
            int intentosMaximos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número máximo de intentos:"));
            int intentosMax = 5;

            Juego ob = new Juego(numeroAdivinar,intentosMax);
            ob.jugar();

            int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres intentarlo de nuevo?","Reiniciar juego", JOptionPane.YES_NO_OPTION);
            if(opcion != JOptionPane.YES_OPTION) {
                jugarDeNuevo = false;
            }
        }
    }
}