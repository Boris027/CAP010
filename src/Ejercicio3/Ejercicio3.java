package Ejercicio3;
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio3 {
    

    public static void main(String[] args) {
       
        
        ArrayList<Numeros> lista=new ArrayList<Numeros>();

        for(int i=0;i<=9;i++){
        System.out.print("Introduce un numero: ");
        int numero=Integer.parseInt(System.console().readLine());
        lista.add(new Numeros(numero));
        }

        
        
        for(Numeros a:lista){
            System.out.print(a+" ");
        }

        Collections.sort(lista);
        System.out.println();
        for(Numeros a:lista){
            System.out.print(a+" ");
        }

    }
    

}
