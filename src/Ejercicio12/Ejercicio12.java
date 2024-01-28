package Ejercicio12;
import Ejercicio8.*;
import java.util.HashMap;
import java.util.ArrayList;
public class Ejercicio12 {


    public static void main(String[] args) {
        

        HashMap<String, Integer> valores=new HashMap<String, Integer>(); 
        valores.put("as", 11);
        valores.put("3", 10);
        valores.put("sota", 2);
        valores.put("caballo", 3);
        valores.put("rey", 4);

        ArrayList<Carta> cartas=new ArrayList<Carta>();

        
        for(int i=0;i<=4;i++){

            
            boolean salir=false;

            while (salir==false) {
                int random=(int) (Math.random()*40 +1);
                salir=true;

                for(Carta a:cartas){

                    if(a.getNumeroreal()==random){
                        salir=false;
                    }

                }

                if(salir==true){
                    cartas.add(new Carta(random));
                }
                

            }

            

        }

        

        int puntos=0;

        for(Carta a:cartas){

            
            if(valores.get(a.getnumero())==null){

            }else{
                puntos+=valores.get(a.getnumero());
            }

        }


        for(Carta a:cartas){
            System.out.println(a);
        }

        System.out.println("Tienes: "+ puntos +" puntos");

       
        



        
    }


}
