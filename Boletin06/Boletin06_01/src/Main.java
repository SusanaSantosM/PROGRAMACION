import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Coche obx = new Coche();

        obx.acelerar((int) Float.parseFloat(JOptionPane.showInputDialog("Introduce la velocidad de aceleración: ")));
        obx.frenar((int) Float.parseFloat(JOptionPane.showInputDialog("Introduce la velocidad de frenado: ")));

        JOptionPane.showConfirmDialog(null, "Velocidad final = "+obx.getVelocidade());
    }
}