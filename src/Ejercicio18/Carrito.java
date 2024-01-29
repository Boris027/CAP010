package Ejercicio18;
import java.util.ArrayList;
public class Carrito {
    
    ArrayList<Elemento> cesta=new ArrayList<Elemento>();

    public Carrito(){

    }

    public void agrega(Elemento a){

        boolean repetir=false;
        for(Elemento b:cesta){

            if(b.getNombre().equals(a.getNombre())){
                b.setCantidad(b.getCantidad()+a.getCantidad());
                repetir=true;
            }

        }

        if(repetir==false){
            cesta.add(a);
        }



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
