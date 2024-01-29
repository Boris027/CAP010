package Ejercicio17;
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

}
