import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double meridiano = Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano : "));
        double paralelo = Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo : "));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia a terra : "));
        Satelite satelite = new Satelite(meridiano, paralelo, distancia);
        satelite.verPosicion();
    }
}