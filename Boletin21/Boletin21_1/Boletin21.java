
package boletin21;
public class Boletin21 {

    public static void main(String[] args) {
        int[] numeros = new int[6];//iniciando arrays con 6 filas
       
        
        for(int i=0; i<numeros.length; i++){
            
            //Si quieres un numero que sea entre min:1 y max:50, y que comience desde 1
            //int numeroAleatorio = random.nextInt(max - min) + min;
            numeros[i]= (int) (Math.random()*(50-1)+1); 
            
            //System.out.println(numeros[i] +"");
            
        } 
        //5 filas sin contando el 0
        //i!=-1 para que i sea distinto a -1
        //i-- decremento desde la 5 a la 1 en las filas
        for(int i=5; i!=-1; i--){
            System.out.println("Posición "+i+": "+numeros[i]);
        }
        
    }
    
}
