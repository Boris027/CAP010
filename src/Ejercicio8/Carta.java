package Ejercicio8;

public class Carta implements Comparable<Carta>{
    int numero;

    public Carta(int numero){
        this.numero=numero;
    }

    public String getPalos(){
        return Palos.getpalos(this.numero);
    }

    public String getnumero(){
        return Palos.getnumero(this.numero);
    }

    public int getNumeroreal() {
        return numero;
    }



    @Override
    public int compareTo(Carta o) {
        
        if(this.numero>o.numero){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        
        return this.getnumero()+" de "+this.getPalos();
    }

}
