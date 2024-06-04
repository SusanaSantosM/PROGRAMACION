package Datos;

public class Coche extends Vehiculo{

    private int espacio = 1;
    private String id;

    public Coche(){
        this.espacio = espacio;
        this.id = id;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
