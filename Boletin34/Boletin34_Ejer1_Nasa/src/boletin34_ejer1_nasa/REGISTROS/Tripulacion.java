
package boletin34_ejer1_nasa.REGISTROS;

public class Tripulacion {
    private String nomTripulacion;
    private String nombre;
    private String apellido; 
    private int numTripulantes;
    
    
    //Constructores
    public Tripulacion(){}

    public Tripulacion(String nombre, String apellido, int numTripulantes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTripulantes = numTripulantes;
    }
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }
    
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    @Override
    public String toString() {
        return """
               Tripulacion:
               Nombre: """ + nombre + "\nApellido: " + apellido + "\nNumero de tripulantes: " + numTripulantes;
    }
    
    
}
