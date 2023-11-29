import javax.swing.JOptionPane;
public class Juego {
    private final int numeroAdivinar;
    private final int intentosMaximos;

    public Juego(int intentosMaximos) {
        this.numeroAdivinar = (int) (Math.random() * 50) + 1;
        this.intentosMaximos = intentosMaximos;
    }
    public void jugar() {
        for (int intentos = 1; intentos <= intentosMaximos; intentos++) {
            int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Intento " + intentos + ": Ingresa un número entre 1 y 50:"));

            int distancia = Math.abs(numeroAdivinar - numeroUsuario);

            if (distancia > 20) {
                JOptionPane.showMessageDialog(null, "Demasiado lejos.");
            } else if (distancia >= 10 && distancia <= 20) {
                JOptionPane.showMessageDialog(null, "Lejos.");
            } else if (distancia > 5 && distancia < 10) {
                JOptionPane.showMessageDialog(null, "Cerca.");
            } else if (distancia <= 5) {
                JOptionPane.showMessageDialog(null, "Muy cerca.");
            }

            if (numeroUsuario == numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");
                break;
            }

            if (intentos == intentosMaximos) {
                JOptionPane.showMessageDialog(null, "¡Se acabaron los intentos! El número correcto era " + numeroAdivinar);
            }
        }
    }
}
