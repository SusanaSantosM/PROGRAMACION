
package boletin20;

public class Tigre extends Felino implements Caminar,Nadar{

    @Override
    public void Camina() {
        System.out.println("El tigre camina");
        }

    @Override
    public void Nada() {
        System.out.println("El tigre nada pero no le gusta el agua");
    }
    
}
