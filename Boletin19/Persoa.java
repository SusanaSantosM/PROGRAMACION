
package boletin19;

public class Persoa implements IPoderCantar {
    private String tenor;


    public Persoa(String tenor, String doremi) {
        this.tenor = tenor;
    }

    public Persoa() {
    }

    @Override
    public void Cantar() {
        System.out.println("Do,re,mi,fa,sol,la,si,do");
        
    }
}
