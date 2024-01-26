package Ejercicio4;

public class Palabras implements Comparable<Palabras> {
    

    private String nombre;


    public Palabras(String nombre){
        this.nombre=nombre;
    }



    @Override
    public int compareTo(Palabras o) {
        
        return (this.nombre).compareTo(o.nombre);
    }

    


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

}
