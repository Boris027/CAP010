package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    
    public static int aleatorio(int rango1,int rango2){

        int random=(int) (Math.random()*(rango2-rango1+1) +rango1);
        return random;
    }


    public static void main(String[] args) {
        
        int tamañolista=aleatorio(10, 20);
        System.out.println(tamañolista);

        ArrayList<Integer> lista=new ArrayList<Integer>();

        int max=0;
        int min=0;
        for(int i=0;i<=tamañolista-1;i++){
            int random=aleatorio(0, 100);
            lista.add(random);

            max=random;
            min=random;
        }
        
        System.out.println(lista);
        int suma=0;
        
        for(int contador:lista){
             suma+=contador;

             if(min>contador){
                min=contador;
             }

             if(max<contador){
                max=contador;
             }
        }


        System.out.println("La suma es de: "+suma);
        System.out.println("La media es de: "+suma/lista.size());
        System.out.println("El numero mas grande es: "+max);
        System.out.println("El numero mas pequeño es: "+min);

    }

}
