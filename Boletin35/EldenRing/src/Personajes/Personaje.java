package Personajes;

public class Personaje {
    private String nombre;
    private int vida;
    private int fuerza;
    private int sadiduria;
    private int destreza;

    public Personaje(String nombre, int vida, int fuerza, int sabiduria, int destreza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.sadiduria = sabiduria;
        this.destreza = destreza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSadiduria() {
        return sadiduria;
    }

    public void setSadiduria(int sadiduria) {
        this.sadiduria = sadiduria;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
}
