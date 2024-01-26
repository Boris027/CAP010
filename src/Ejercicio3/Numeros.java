package Ejercicio3;

public class Numeros implements Comparable<Numeros> {
    
    private int numero;


    public Numeros(int numero){
        this.numero=numero;
    }

    @Override
    public String toString() {
        return this.numero+"";
    }

    @Override
    public int compareTo(Numeros o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.numero, o.numero);
    }

}
