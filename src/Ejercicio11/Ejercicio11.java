package Ejercicio11;
import Ejercicio10.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
public class Ejercicio11 {
    

    public static void main(String[] args) {
        
        HashMap<String,String> lista=new HashMap<String,String>();
        
        lista=Ejercicio10.metermenu(lista);
        
        
        System.out.println(lista);

        
        
        
        ArrayList<String> lista2=new ArrayList<>(lista.keySet());

        Collections.shuffle(lista2);

        System.out.println(lista2);

        ArrayList<Boolean> notas=new ArrayList<Boolean>();

        for(int i=0;i<=3;i++){

            int random=(int) (Math.random()*lista.size()+1);
            
            System.out.println("Como se dice esta palabra en ingles: "+lista2.get(random));
            System.out.print("Eleccion: ");
            String palabra=System.console().readLine();

            if(lista.get(lista2.get(random)).equals(palabra)){
                notas.add(true);
            }else{
                notas.add(false);
            }

        }

        for(int i=0;i<=3;i++){

            System.out.println(i+1 +" es " +notas.get(i));

        }

    }

}
