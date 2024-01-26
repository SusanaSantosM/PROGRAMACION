
package ejer_arraybi_1;

public class Ejer_ArrayBi_1 {

    public static void main(String[] args) {
            String[][] tablero = new String[8][8];
    
     tablero[0][0] = "torre";
     tablero[0][1] = "caballo";
     tablero[0][2] = "alfil";
     tablero[0][3] = "Rey";
     tablero[0][4] = "Reina";
     tablero[0][5] = "alfil";
     tablero[0][6] = "caballo";
     tablero[0][7] = "torre";
     
     tablero[1][0] = "peon";
     tablero[1][1] = "peon";
     tablero[1][2] = "peon";
     tablero[1][3] = "peon";
     tablero[1][4] = "peon";
     tablero[1][5] = "peon";
     tablero[1][6] = "peon";
     tablero[1][7] = "peon";
     
     tablero[2][0] ="";
     tablero[2][1] ="";
     tablero[2][2] ="";
     tablero[2][3] ="";
     tablero[2][4] ="";
     tablero[2][5] ="";
     tablero[2][6] ="";
     tablero[2][7] ="";
     
     tablero[3][0] ="";
     tablero[3][1] ="";
     tablero[3][2] ="";
     tablero[3][3] ="";
     tablero[3][4] ="";
     tablero[3][5] ="";
     tablero[3][6] ="";
     tablero[3][7] ="";
     
     tablero[4][0] ="";
     tablero[4][1] ="";
     tablero[4][2] ="";
     tablero[4][3] ="";
     tablero[4][4] ="";
     tablero[4][5] ="";
     tablero[4][6] ="";
     tablero[4][7] ="";
     
     tablero[5][0] ="";
     tablero[5][1] ="";
     tablero[5][2] ="";
     tablero[5][3] ="";
     tablero[5][4] ="";
     tablero[5][5] ="";
     tablero[5][6] ="";
     tablero[5][7] ="";
     
     tablero[6][0] = "peon";
     tablero[6][1] = "peon";
     tablero[6][2] = "peon";
     tablero[6][3] = "peon";
     tablero[6][4] = "peon";
     tablero[6][5] = "peon";
     tablero[6][6] = "peon";
     tablero[6][7] = "peon";
     
     tablero[7][0] = "torre";
     tablero[7][1] = "caballo";
     tablero[7][2] = "alfil";
     tablero[7][3] = "Rey";
     tablero[7][4] = "Reina";
     tablero[7][5] = "alfil";
     tablero[7][6] = "caballo";
     tablero[7][7] = "torre";
     
     //Mostramos el tablero
     for(int i=0; i<tablero.length; i++){
         for(int j=0; j<tablero.length; j++){
             System.out.print(tablero[i][j]+ "\t");
         }
            System.out.println(); //salto de linea
     }
   
     
    }
    
}
