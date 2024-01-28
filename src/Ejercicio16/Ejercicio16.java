package Ejercicio16;
import java.util.HashMap;
public class Ejercicio16 {

    public static HashMap<String,String> inicializar(){
        HashMap<String,String> lista=new HashMap<String,String>();

        lista.put("España", "Madrid");
        lista.put("Portugal", "Lisboa");
        lista.put("Francia", "Paris");

        return lista;
    }
    
    public static void main(String[] args) {
        
        HashMap<String,String> lista=inicializar();

        boolean salir=false;

        while (salir==false) {
            
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            String nombre=System.console().readLine();

            if(nombre.equals("salir")){
                break;
            }

            if(lista.containsKey(nombre)){
                System.out.println("La capital de "+nombre+" es "+lista.get(nombre));
            }else{
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+nombre+" ?");
                String capital=System.console().readLine();
                lista.put(nombre, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }


        }


    }

}
