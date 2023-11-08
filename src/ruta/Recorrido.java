package ruta;

public class Recorrido {
    
    public double duracion;
    public int salida;
    public int destino;
    public int lSalida;
    public int lDestino;

    public Recorrido(double d, int sal, int des, int lsal, int ldest){
        this.duracion = d;
        this.salida = sal;
        this.destino = des;
        this.lSalida = lsal;
        this.lDestino = ldest;        
    }

    public double getDuracion(){
        return this.duracion;
    }

    public int getSalida(){
        return this.salida;
    }

    public int getDestino(){
        return this.destino;
    }

    public int getLSalida(){
        return this.lSalida;
    }

    public int getLDestino(){
        return this.lDestino;
    }

    public void setDuracion(double t){
        this.duracion= t;
    }

    public void setSalida(int s){
        this.salida = s;
    }

    public void setDestino(int d){
        this.destino=d;
    }

    public void setLSalida(int s){
        this.lSalida = s;
    }

    public void setLDestino(int d){
        this.lDestino = d;
    }
}
