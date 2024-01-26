package Ejercicio5;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio5 {
    

    public static void menu(){
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
    }

    public static void main(String[] args) {
        
        ArrayList<ColeccionDisco> lista=new ArrayList<ColeccionDisco>();

        boolean salir=false;

        Scanner sc=new Scanner(System.in);

        while(salir==false){


            menu(); 
            int eleccion1=sc.nextInt();


            String codigo; 
            String autor; 
            String titulo; 
            String genero; 
            int duracion;

            switch (eleccion1) {
                case 1:

                    for(ColeccionDisco a:lista){
                        System.out.println(a);
                    }
                    
                    break;
            
                case 2:
                    String vacio=sc.nextLine();
                    System.out.print("Introduzca el codigo: ");
                    codigo=sc.nextLine();
                    System.out.print("Introduzca el autor: ");
                    autor=sc.nextLine();
                    System.out.print("Introduzca el titulo: ");
                    titulo=sc.nextLine();
                    System.out.print("Introduzca el genero: ");
                    genero=sc.nextLine();
                    System.out.print("Introduzca la duracion en minutos: ");
                    duracion=sc.nextInt();

                    lista.add(new ColeccionDisco(codigo, autor, titulo, genero, duracion));
                    break;

                case 3:
                    int contador=0;
                    for(ColeccionDisco a: lista){
                        System.out.println("["+contador+"]"+a.getTitulo());
                        contador+=1;
                    }

                    
                    System.out.print("¿Cual quieres modificar?: ");
                    int seleccion=sc.nextInt();
                    vacio=sc.nextLine();
                    System.out.print("Introduzca el codigo: ");
                    lista.get(seleccion).setCodigo(sc.nextLine());
                    System.out.print("Introduzca el autor: ");
                    lista.get(seleccion).setAutor(sc.nextLine());
                    System.out.print("Introduzca el titulo: ");
                    lista.get(seleccion).setTitulo(sc.nextLine());
                    System.out.print("Introduzca el genero: ");
                    lista.get(seleccion).setGenero(sc.nextLine());
                    System.out.print("Introduzca la duracion en minutos: ");
                    lista.get(seleccion).setDuracion(sc.nextInt());


                    break;

                case 4:
                    contador=0;
                    for(ColeccionDisco a: lista){
                        System.out.println("["+contador+"]"+a.getTitulo());
                        contador+=1;
                    }
                    System.out.print("¿Cual quieres eliminar?: ");
                    seleccion=sc.nextInt();

                    lista.remove(seleccion);


                    break;

                case 5:
                    System.out.println("Gracias por usar la Coleccion de disco");
                    salir=true;
                    break;
                default:
                    break;
            }
            





        }



    }

}
