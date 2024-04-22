
package boletin34_ejer1_nasa.REGISTROS;

import java.util.ArrayList;
import java.util.Date;

public class Mision {
    private String nomMision;
    private Date fechaLanzamiento;
    private String objetivo;
    private String tipoNave;
    ArrayList<Tripulacion> tripulacion = new ArrayList<>();
    
    //Constructores
    public Mision(){
    }

    public Mision(String nomMision, Date fechaLanzamiento, String objetivo, String tipoNave) {
        this.nomMision = nomMision;
        this.fechaLanzamiento = fechaLanzamiento;
        this.objetivo = objetivo;
        this.tipoNave = tipoNave;
    }
    
    
    //Getters
    public String getNomMision() {
        return nomMision;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getTipoNave() {
        return tipoNave;
    }

    public ArrayList<Tripulacion> getTripulacion() {
        return tripulacion;
    }
    
    
    //Setters
    public void setNomMision(String nomMision) {
        this.nomMision = nomMision;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setTipoNave(String tipoNaven) {
        this.tipoNave = tipoNave;
    }

    public void setTripulacion(ArrayList<Tripulacion> tripulacion) {
        this.tripulacion = tripulacion;
    }

    @Override
    public String toString() {
        return """
               Mision
               Nombre: """ + nomMision + "\nLanzamiento: " + fechaLanzamiento + "\nobjetivo: " + objetivo + "\nNave: " + tipoNave + "\nTripulacion: " + tripulacion;
    }
    
    
}
