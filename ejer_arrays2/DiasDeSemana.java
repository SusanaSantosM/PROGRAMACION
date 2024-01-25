
package ejer_arrays2;

import javax.swing.JOptionPane;

public class DiasDeSemana {
   public  String[] diasSemana = {"Lunes", "Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    
    public  void mostrarDia(int dia){
        if(dia>0 && dia<=7){
            JOptionPane.showMessageDialog(null,diasSemana[dia-1]);
        }else {
            dia= Integer.parseInt(JOptionPane.showInputDialog("Error, intoduce un valor válido"));
        }
    }
}
