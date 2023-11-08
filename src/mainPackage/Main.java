package mainPackage;

import java.util.ArrayList;
import java.util.List;

import ruta.*;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Parada> mapaNodos = new ArrayList<Parada>();
        Ruta mapa = new Ruta(mapaNodos);
        
        mapa.generarGrafoGlobal();
    }

}

