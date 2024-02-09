
package boletin22;

public class Boletin22 {

    public static void main(String[] args) {
        String[] equipos = {"Celta","Bilbao","Malaga"};
        int[][] goles = {
            {3,4,2},
            {1,2,1},
            {3,0,1},
            };   
        
        System.out.println("Equipo / Xornada\tX1\tX2\tX3");
        for(int i=0; i<goles.length; i++){
            System.out.print(equipos[i] + "\t\t\t");
            for(int j=0; j<goles[i].length; j++){
                System.out.print(goles[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
