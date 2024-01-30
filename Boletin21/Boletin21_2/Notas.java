
package boletin21_2;

import javax.swing.JOptionPane;

public class Notas {
    float[] nota = new float[30];

    public void ingresamosNotas(){
        for(int i=0; i<nota.length; i++){
        nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingresamos las notas valoradas del 1 al 10"));
        }
    }

    public void Aprobados(){
        int aprobados=0;
        int suspensos=0;
        for(int i=0; i<nota.length; i++){
            if(nota[i]>=5){
                aprobados++;                                
            }else{
                suspensos++;
            }
        }JOptionPane.showMessageDialog(null,"El numero de aprobados es: "+aprobados);
                        JOptionPane.showMessageDialog(null, "El numero de suspensos es: "+suspensos);
    }
    
    public void NotaMedia(){
        float suma=0;
        for(int i=0; i<nota.length; i++){
            suma=suma+nota[i];
        }
        JOptionPane.showMessageDialog(null, "La nota media es: "+suma/nota.length);
    }
    
    public void NotaMasAlta(){
        float max=nota[0];
        for(int i=1; i<nota.length; i++){
            if(nota[i]>max)
                max = nota[i];           
        }JOptionPane.showMessageDialog(null, "La nota más alta es: "+max);
    }
    
}

