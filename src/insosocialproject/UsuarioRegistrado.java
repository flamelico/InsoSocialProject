
package insosocialproject;

import java.util.Date;

public class UsuarioRegistrado extends Usuario{
    
     
    private String  mail, celular, tags;
    private boolean tipomem;
    private int canterealiz, canteasis, cantden;
    private float popu;

    public UsuarioRegistrado(String mail, String celular, String tags, String nick, String nombre, String apellido, String ciudad, String descripcion, Date fnacim, boolean sexo, boolean enlinea, boolean estado, int edad) {
        super(nick, nombre, apellido, ciudad, descripcion, fnacim, sexo, enlinea, estado, edad);
        this.mail = mail;
        this.celular = celular;
        this.tags = tags;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public int getCanteasis() {
        return canteasis;
    }

    public void setCanteasis(int canteasis) {
        this.canteasis = canteasis;
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
