package Ejercicio19;
import java.util.HashMap;
import java.util.ArrayList;
public class Ejercicio19 {
    
    public static HashMap<String,String> inicializar(){

        HashMap<String,String> lista=new HashMap<String,String>();

        lista.put("caliente", "hot");
        lista.put("rojo", "red");
        lista.put("ardinete", "hot");
        lista.put("verde", "green");
        lista.put("agujetas", "stiff");
        lista.put("abrasador", "hot");
        lista.put("hierro", "iron");
        lista.put("grande", "big");
        

        return lista;
    }


    public static void main(String[] args) {
        
        HashMap<String,String> lista=inicializar();
        ArrayList<String> claves=new ArrayList<>(lista.keySet());

        while(true==true){
            
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            String palabra=System.console().readLine();

            if(palabra.equals("salir")){
                break;
            }

            if(!lista.containsKey(palabra)){
                System.out.println("No conozco esa palabra");
            }else{

            

                int contador=0;
                for(String a:claves){

                    if(lista.get(palabra).equals(lista.get(a))&& a!=null){
                        contador+=1;
                    }
                    
                }

                
                if(contador==1){
                    System.out.println("No conozco sinónimos de esa palabra");
                }else{
                    contador-=1;
                    System.out.print("Sinónimos de "+palabra +": ");
                    for(String a:claves){

                        if(!a.equals(palabra) && a!=null){

                        
                            if(lista.get(palabra).equals(lista.get(a)) && contador>1){
                                System.out.print(a +", ");
                                contador-=1;
                            }else if(lista.get(palabra).equals(lista.get(a)) && contador==1){
                                System.out.print(a +"");
                                contador-=1;
                            }
                        }
                    }
                    System.out.println();

                }
            }

        }

        

    }

}
