
package ejer_array_1;

import javax.swing.JOptionPane;

public class Calificaciones {
    float notas[] = new float[10]; 
    
    public void ingresaNotas(){
        for(int i=0; i<notas.length; i++){
            //length es la cantidad de elementos del array notas.
            notas[i]= Float.parseFloat(JOptionPane.showInputDialog("Ingresa las notas"));
        }     
    }
    
    public void sumaNotaMedia(){
        float suma=0;
        for(int i=0; i<notas.length; i++){
            suma+=notas[i];
        }
        JOptionPane.showMessageDialog(null, "La nota media es: "+suma/notas.length);
    }
    
    public void notaMaxMin(){
        float max = notas[0];
        float min = notas[0];
        for(int i=1; i<notas.length; i++){
            if (notas[i]>max){
                max = notas[i]; // esto actualizará el maximo
            } else if(notas[i]<min){
                min = notas[i]; // esto actualizará el minnimo
            }
        }
        JOptionPane.showMessageDialog(null, "La nota más alta es "+max+" \n y la nota minima es: "+min);
    }
    
}
