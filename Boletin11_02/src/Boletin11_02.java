import javax.swing.*;

public class Boletin11_02 {
    public static void main(String[] args) {
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            int intentosMaximos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número máximo de intentos:"));

            Juego ob = new Juego(intentosMaximos);
            ob.jugar();

            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas jugar de nuevo?", "Reiniciar juego", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                jugarDeNuevo = false;
            }
        }
    }
}