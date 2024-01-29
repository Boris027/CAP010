package Ejercicio7;
import java.util.ArrayList;
public class Ejercicio7{

    public static String moneda(){
        

        int random=(int) (Math.random()*2);

        if(random==0){
            return "cara";
        }else return "cruz";

        
    }


    public static int valor(){
        int random=(int) (Math.random()*8);

        if(random==0){
            return 1;
        }else if(random==1){
            return 2;
        }else if(random==2){
            return 5;
        }else if(random==3){
            return 10;
        }else if(random==4){
            return 20;
        }else if(random==5){
            return 50;
        }else if(random==6){
            return 100;
        }else if(random==7){
            return 200;
        }

        return 1000;
    }

    public static void main(String[] args) {
        
        ArrayList<Moneda> lista=new ArrayList<Moneda>();

        for(int i=0;i<=5;i++){

            String moneda=moneda();
            int valor=valor();

            if(lista.size()==0){
                lista.add(new Moneda(valor, moneda));
            }else if(moneda.equals("cruz")){
                lista.add(new Moneda(valor, moneda));
            }else{

                lista.add(new Moneda(lista.get(lista.size()-1).getCantidad(), moneda));

            }
        }


        for(Moneda a:lista){
            System.out.println(a);
        }

        
        
        
        
        
        

    }



}