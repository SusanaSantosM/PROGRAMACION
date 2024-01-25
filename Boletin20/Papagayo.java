
package boletin20;

public class Papagayo extends Aves implements Caminar,Volar{
    
    @Override
    public void Camina() {
        System.out.println("El papagayo camina");
    }

    @Override
    public void Vuela() {
        System.out.println("El papagayo vuela muy bien");
    }
    
}
