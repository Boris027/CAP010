package Ejercicio4;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio4 {
    

    public static void main(String[] args) {
        
        ArrayList<Palabras> lista=new ArrayList<Palabras>();

        for(int i=0;i<=9;i++){
            System.out.print("Introduce una palabra: ");
            String palabra=System.console().readLine();
            lista.add(new Palabras(palabra));
        }

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        



    }

}
