package Ejercicio10;
import java.util.HashMap;
public class Ejercicio10 {
    
    public static void menu(){
        System.out.println("1.Traducir palabra");
        System.out.println("2.Salir");
    }

    public static HashMap<String,String> metermenu(HashMap<String,String> lista){
        lista.put("Hola", "Hello");
        lista.put("Perro", "Dog");
        lista.put("Gato", "Cat");
        lista.put("Arbol", "Tree");
        lista.put("Sol", "Sun");
        lista.put("Agua", "Water");
        lista.put("Amigo", "Friend");
        lista.put("Pelota", "Ball");
        lista.put("Pajaro", "Bird");
        lista.put("Tiempo", "Time");
        lista.put("Amor", "Love");
        lista.put("Rojo", "Red");
        lista.put("Azul", "Blue");
        lista.put("Verde", "Green");
        lista.put("Amarillo", "Yellow");
        lista.put("Dorado", "Gold");
        lista.put("Rosa", "Pink");
        lista.put("Escuela", "School");
        lista.put("Dia", "Day");
        lista.put("Español", "Spanish");

        return lista;
    }
    public static void main(String[] args) {
    
        HashMap<String, String> lista=new HashMap<String,String>();
        
        lista=metermenu(lista);


        boolean salir=false;

        while (salir==false) {
            menu();
            System.out.print("Eleccion: ");
            int eleccion=Integer.parseInt(System.console().readLine());

            switch (eleccion) {
                case 1:
                    System.out.print("Introduzca la palabra: ");
                    String palabra=System.console().readLine();

                    if(lista.containsKey(palabra)){
                        System.out.println("La palabra: "+palabra+" significa: "+lista.get(palabra));
                    }

                    break;
                case 2:
                    salir=true;
                    break;
                default:
                    break;
            }

        }

    }

}
