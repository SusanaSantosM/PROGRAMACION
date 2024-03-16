import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        float centigrados = Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en grados centígrados: "));

        try {
            float farenheit = ConversorDeTemperaturas.centigradosAFarenheit(centigrados);
            System.out.println("Temperatura en grados Farenheit: "+farenheit);

            float reamur = ConversorDeTemperaturas.centigradosAReamur(centigrados);
            System.out.println("Temperatura en grados Reamur: "+ reamur);
        } catch (TemperaturaErradaExcepcion e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}