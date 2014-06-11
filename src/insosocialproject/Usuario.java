
package insosocialproject;

import java.util.*;

public class Usuario {
    
    private String nick, nombre, apellido, ciudad, descripcion;
    private Date fnacim, fregis;
    private boolean sexo, enlinea, estado;
    private int edad;

    public Usuario(String nick, String nombre, String apellido, String ciudad, String descripcion, Date fnacim, boolean sexo, boolean enlinea, boolean estado, int edad) {
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.fnacim = fnacim;
        java.util.Date fecha = new Date();
        fregis=fecha;
        this.sexo = sexo;
        this.enlinea = enlinea;
        this.estado = estado;
        this.edad = edad;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFnacim() {
        return fnacim;
    }

    public void setFnacim(Date fnacim) {
        this.fnacim = fnacim;
    }

    public Date getFregis() {
        return fregis;
    }

    public void setFregis(Date fregis) {
        this.fregis = fregis;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isEnlinea() {
        return enlinea;
    }

    public void setEnlinea(boolean enlinea) {
        this.enlinea = enlinea;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
