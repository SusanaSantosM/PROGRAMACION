
package boletin20;

public class Murcielago extends Mamiferos implements Volar,Caminar{

    @Override
    public void Camina() {
        System.out.println("El murcielago camina poco");    }

    @Override
    public void Vuela() {
        System.out.println("El murcielago vuela");
    }
    
}
