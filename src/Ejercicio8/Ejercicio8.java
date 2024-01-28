package Ejercicio8;
import java.util.ArrayList;
public class Ejercicio8 {
    
    public static void main(String[] args) {
        

        ArrayList<Carta> lista=new ArrayList<Carta>();
        int random=(int) (Math.random()*40 +1);

        for(int i=0;i<=9;i++){
            boolean salir=false;
            while(salir==false){
                salir=true;
                random=(int) (Math.random()*40 +1);

                for(Carta a:lista){
                    if(a.getNumeroreal()==random){
                        salir=false;
                    }
                }

            }
                
            lista.add(new Carta(random));

        }


        for(Carta a:lista){
            System.out.println(a);
        }


    }


}
