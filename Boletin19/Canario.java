
package boletin19;

public class Canario implements IPoderCantar{
    private String canario;
    

    public Canario() {
    }

    public Canario(String canario, String sonidoPajaro) {
        this.canario = canario;
    }

    @Override
    public void Cantar() {
        System.out.println("pio,pio");
    }
            
}
