package ruta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ruta implements Serializable {
    
    List<Parada> mapa;
    public double INF = 99999999;
    public double NOENCONTRADO = -40000004;

    public Ruta(List<Parada> l){
        this.mapa = l;
    }

    public void generarGrafoGlobal(){

        List<Recorrido> listaArcos1 = new ArrayList<Recorrido>();
        listaArcos1.add(new Recorrido(2, 1, 2, 1, 1));
        mapa.add(new Parada(1, listaArcos1));

        List<Recorrido> listaArcos2 = new ArrayList<Recorrido>();
        listaArcos2.add(new Recorrido(3, 2, 3, 1, 1));
        mapa.add(new Parada(2, listaArcos2));

        List<Recorrido> listaArcos3 = new ArrayList<Recorrido>();
        listaArcos3.add(new Recorrido(2, 3, 4, 1, 1));
        mapa.add(new Parada(3, listaArcos3));

        List<Recorrido> listaArcos4 = new ArrayList<Recorrido>();
        listaArcos4.add(new Recorrido(7, 4 ,5, 1, 1));
        listaArcos4.add(new Recorrido(4, 4, 12, 1, 2));
        mapa.add(new Parada(4, listaArcos4));
        
        List<Recorrido> listaArcos5 = new ArrayList<Recorrido>();
        listaArcos5.add(new Recorrido(1, 5, 6, 1, 1));
        mapa.add(new Parada(5, listaArcos5));

        /*List<Recorrido> listaArcos6 = new ArrayList<Recorrido>();
        listaArcos6.add(new Recorrido(4, 6, 7, 1, 1));
        mapa.add(new Parada(6, listaArcos6));

        List<Recorrido> listaArcos7 = new ArrayList<Recorrido>();
        listaArcos7.add(new Recorrido(3, 7, 8, 1, 1));
        mapa.add(new Parada(7, listaArcos7));

        List<Recorrido> listaArcos8 = new ArrayList<Recorrido>();
        listaArcos8.add(new Recorrido(2, 8, 9, 1, 1));
        mapa.add(new Parada(8, listaArcos8));

        */List<Recorrido> listaArcos9 = new ArrayList<Recorrido>();
        listaArcos9.add(new Recorrido(1, 9, 10, 1, 1));
        listaArcos9.add(new Recorrido(2, 9, 13, 1, 2));
        mapa.add(new Parada(9, listaArcos9)); /*
        List<Recorrido> listaArcos10 = new ArrayList<Recorrido>();
        mapa.add(new Parada(10, listaArcos10));
        */
        List<Recorrido> listaArcos11 = new ArrayList<Recorrido>();
        listaArcos11.add(new Recorrido(3, 11, 4, 2, 1));
        mapa.add(new Parada(11, listaArcos11));

        List<Recorrido> listaArcos12 = new ArrayList<Recorrido>();
        listaArcos12.add(new Recorrido(3, 12, 9, 2, 1));
        mapa.add(new Parada(12, listaArcos12));

        List<Recorrido> listaArcos13 = new ArrayList<Recorrido>();
        mapa.add(new Parada(13, listaArcos13));
    }

    public double calcular(int nE, int nD){

        
        double aux;
        double peso = INF;

        for (Recorrido l : mapa.get(nE-1).lista) {
            if (l.salida != nD){
                if(l.destino != 0){
                    System.out.println("PARADA ------ " + l.salida);
                    System.out.println("Siguiente: " + l.destino);
                    System.out.println("Duración del viaje: " +l.duracion);
                    aux =calcular(l.destino, nD);
                    if (aux == NOENCONTRADO) {
                        return INF;
                    }

                    if (aux < peso) {
                        peso = aux;
                    }
                    return peso;
                }               
            }
            else {
                System.out.println("Final de trayecto: " + l.destino);
                return 0;
            }   
        }
        return NOENCONTRADO;
    }
}
