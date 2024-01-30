package Ejercicio21;
import java.util.HashMap;
import java.util.ArrayList;

public class Ejercicio21 {
    


    public static void main(String[] args) {
        
        HashMap<String,String> lista1=new HashMap<>();

        lista1.put("rana", "En los trópicos y cerca de las zonas humedas y acuaticas");
        lista1.put("Salamandra","Ecosistemas húmedos");
        lista1.put("Sapo","En cualquier sitio salvo el desierto y la Antartida");
        lista1.put("triton","America y Africa");

        HashMap<String,String> lista2=new HashMap<>();

        lista2.put("rana", "Larvas e insectos");
        lista2.put("Salamandra","Pequeños crustaceos e insectos");
        lista2.put("Sapo","Insectos,lombrices y pequeños roedores");
        lista2.put("triton","Insectos");


        ArrayList<String> animales=new ArrayList<>(lista1.keySet());



        boolean salir=false;

        while(salir==false){

            System.out.print("Introduzca el tipo de anfibio: ");
            String nombre=System.console().readLine();

            if(nombre.equals("salir")){
                break;
            }

            if(!lista1.containsKey(nombre)){
                System.out.println("Ese tipo de anfibio no existe.");
            }else{

                System.out.println("Habitat: "+lista1.get(nombre));
                System.out.println("Alimentación: "+lista2.get(nombre));
            }





        }


    }



}
