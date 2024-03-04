
package Ejer1_Boletin26;
import java.util.Collections;


public class Operaciones<Operacion> {
    private Operacion numero;
    
    public void agregar(Operacion numero){
        //Para agregar un valor a la list
        this.numero=numero;
    }
            
    public Operacion obtener(){
        return numero;
    }

    public Operacion getNumero() {
        return numero;
    }

    public void setNumero(Operacion numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Operaciones" + "numero=" + numero;
    }
    
    

}
