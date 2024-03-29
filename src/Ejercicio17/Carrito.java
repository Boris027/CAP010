package Ejercicio17;
import Ejercicio18.Elemento;
import java.util.ArrayList;
public class Carrito {
    
    ArrayList<Elemento> cesta=new ArrayList<Elemento>();

    public Carrito(){

    }

    public void agrega(Elemento a){
        
            cesta.add(a);

    }

    public int numeroDeElementos(){
        return cesta.size();
    }


    public float importeTotal(){

        float importe=0;

        for(Elemento a:cesta){

            importe+=a.getPrecio()*a.getCantidad();
        }

        return importe;
    }


    @Override
    public String toString() {
        String resultado="";

        resultado+="Contenido del carrito\n";
        resultado+="=====================\n";


        for(Elemento a:cesta){

            resultado+=a.toString()+"\n";
        }

        

        return resultado;
    }


}
