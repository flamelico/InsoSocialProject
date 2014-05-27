
package insosocialproject;

import java.util.*;

public class Usuario {
    
    private String nick, nombre, apellido, ciudad, descripcion;
    private Date fnacim, fregis;
    private boolean sexo, enlinea, estado;
    private int edad;

    public Usuario(String nick, String nombre, String apellido, String ciudad, String descripcion, Date fnacim, Date fregis, boolean sexo, boolean enlinea, boolean estado, int edad) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.fnacim = fnacim;
        this.fregis = fregis;
        this.sexo = sexo;
        this.enlinea = enlinea;
        this.estado = estado;
        this.edad = edad;
    }
    
    
    
   
}
