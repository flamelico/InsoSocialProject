
package insosocialproject;

import java.util.Date;

public class UsuarioRegistrado extends Usuario{
    
     
    private String  mail, celular, tags;
    private boolean tipomem;
    private int canterealiz, canteasis, cantden;
    private float popu;

    public UsuarioRegistrado(String mail, String celular, String tags, boolean estado, boolean tipomem, int canterealiz, int canteasis, int cantden, float popu, String nick, String nombre, String apellido, String ciudad, String descripcion, Date fnacim, Date fregis, boolean sexo, boolean enlinea, int edad) {
        super(nick, nombre, apellido, ciudad, descripcion, fnacim, fregis, sexo, enlinea, estado, edad);
        this.mail = mail;
        this.celular = celular;
        this.tags = tags;
        this.tipomem = tipomem;
        this.canterealiz = canterealiz;
        this.canteasis = canteasis;
        this.cantden = cantden;
        this.popu = popu;
    }
    
    
    
}
