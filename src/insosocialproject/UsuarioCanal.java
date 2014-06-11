
package insosocialproject;

import java.util.Date;


public class UsuarioCanal {
    
    private String nick, mail, ciudad,tags, descripcion;
    private Date fregis;
    private boolean estado, tipomem;
    private int canterealiz, cantden;
    private float popu;

    public UsuarioCanal(String nick, String mail, String ciudad, String tags, String descripcion) {
        this.nick = nick;
        this.mail = mail;
        this.ciudad = ciudad;
        this.tags = tags;
        this.descripcion = descripcion;
        java.util.Date fecha = new Date();
        fregis=fecha;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFregis() {
        return fregis;
    }

    public void setFregis(Date fregis) {
        this.fregis = fregis;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isTipomem() {
        return tipomem;
    }

    public void setTipomem(boolean tipomem) {
        this.tipomem = tipomem;
    }

    public int getCanterealiz() {
        return canterealiz;
    }

    public void setCanterealiz(int canterealiz) {
        this.canterealiz = canterealiz;
    }

    public int getCantden() {
        return cantden;
    }

    public void setCantden(int cantden) {
        this.cantden = cantden;
    }

    public float getPopu() {
        return popu;
    }

    public void setPopu(float popu) {
        this.popu = popu;
    }
    
}
