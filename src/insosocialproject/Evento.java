
package insosocialproject;

import java.util.*;


public class Evento {
    
    private String nombre,lugar;
    private Date fechacrea,fechainicio,fechafin;
    private int cantasist;
    private boolean estado;

    public Evento(String nombre, String lugar, Date fechainicio, Date fechafin) {
        this.nombre = nombre;
        this.lugar = lugar;
        java.util.Date fecha = new Date();
        fechacrea=fecha;
        cantasist=0;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        estado=false;
    }
    
    
    
}
