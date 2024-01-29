package Ejercicio20;
import java.util.ArrayList;
import java.util.HashMap;
import Ejercicio19.Ejercicio19;

public class Ejercicio20 {
    





    public static void main(String[] args) {
        

        HashMap<String,String> lista=Ejercicio19.inicializar();

        ArrayList<String> claves=new ArrayList<>(lista.keySet());


            while(true==true){
                
                System.out.print("Introduzca una palabra y le daré los sinónimos: ");
                String palabra=System.console().readLine();

                if(palabra.equals("salir")){
                    break;
                }

                if(!lista.containsKey(palabra)){
                    System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
                    String eleccion=System.console().readLine();

                    if(eleccion.equals("s")){
                        System.out.print("Introduce la traduccion de "+palabra +" en ingles: ");
                        String ingles=System.console().readLine();

                        lista.put(palabra, ingles);
                        claves.add(palabra);

                        System.out.println("Gracias por enseñarme nuevas palabras");

                    }else break;

                }else{

                

                    int contador=0;
                    for(String a:claves){

                        if(lista.get(palabra).equals(lista.get(a))&& a!=null){
                            contador+=1;
                        }
                        
                    }

                    
                    if(contador==1){
                        System.out.print("No conozco sinónimos de esa palabra ¿quiere añadirla al diccionario? (s/n): ");
                        String eleccion=System.console().readLine();

                        if(eleccion.equals("s")){
                            System.out.print("Introduce un sinónimo de "+palabra +": ");
                            String sinonimo=System.console().readLine();

                            lista.put(sinonimo, lista.get(palabra));
                            claves.add(sinonimo);

                            System.out.println("Gracias por enseñarme nuevos sinónimos");

                        }else break;

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



