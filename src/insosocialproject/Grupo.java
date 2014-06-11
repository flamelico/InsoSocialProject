package insosocialproject;

public class Grupo extends Categoria{
    
    private int cantden,cantreal,cantpend;
    private double popu;
    private String creador,TAG,desc;

    public Grupo(double popu, String creador, String TAG, String desc, String nombre, String tags, String descripcion) {
        super(nombre, creador, tags, descripcion);
        this.TAG = TAG;
        this.desc = desc;
        popu=0;
        cantden=0;
        cantreal=0;
        cantpend=0;
    }
    
}
