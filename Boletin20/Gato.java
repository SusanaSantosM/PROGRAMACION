
package boletin20;

public class Gato extends Felino implements Caminar,Nadar{
    private String persa;

    public Gato() {
    }

    public Gato(String persa) {
        this.persa = persa;
    }

    @Override
    public void Camina() {
        System.out.println("El gato camina");
    }

    @Override
    public void Nada() {
        System.out.println("El gato nada pero no le gusta el agua");
    }
    
    
}
