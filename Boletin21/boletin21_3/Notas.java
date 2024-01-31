
package boletin21_3;

import javax.swing.JOptionPane;

public class Notas {
    float[] nota = new float[5];
    String[] nombre = new String[5];
    
    public void ingresamosDatos(){
        for(int i=0; i<nombre.length;i++){ 
             nombre[i] = JOptionPane.showInputDialog("Ingrese nombre del alumno");
            for(int a=0; a<nota.length; a++){
                nota[a] = Float.parseFloat(JOptionPane.showInputDialog("Ingresamos las notas valoradas del 1 al 10")); 
            }           
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
