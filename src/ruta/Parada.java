package ruta;

import java.util.List;

public class Parada {
    
    public int ID;
    public List<Recorrido> lista;

    public Parada(int i, List<Recorrido> lis){
        this.ID = i;
        this.lista = lis;
    }

}
