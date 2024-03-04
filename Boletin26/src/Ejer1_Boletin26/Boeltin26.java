
package Ejer1_Boletin26;

import java.util.Collections;
import java.util.List;

public class Boeltin26 {
    public static void main(String[] args) {
        // Hacemos las siguientes funciones
        
        //Con una lista de elementos Integer
        Operaciones<Integer>listaNumInt = new Operaciones<>();
        listaNumInt.
        
        System.out.println(listaNumInt.obtener());
        
        
    }
    
        public Integer getMin(List<Integer>list){
            if (list == null || list.size() == 0){
             return Integer.MAX_VALUE;
        }
         return Collections.min(list);
    }
    
        public Integer getMax(List<Integer>list){
            if(list == null || list.size() == 0){
                return Integer.MIN_VALUE;
        }
            return Collections.max(list);
    }      
        
}
