package Ejercicio15;
import Ejercicio14.*;
import java.util.ArrayList;
import java.util.HashMap;
public class Ejercicio15 {
    


    public static void main(String[] args) {
        
        HashMap<String,Double> lista=Ejercicio14.inicializar();

        ArrayList<Productos> Cliente=new ArrayList<Productos>();
        
        boolean salir=false;
        boolean modificar=false;
        String descuento="";
        while(salir==false){
            modificar=false;
            System.out.print("Producto: ");
            String producto=System.console().readLine();
            if(producto.equals("fin")){

                System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno):");
                descuento=System.console().readLine();
                break;
            }

            System.out.print("Cantidad: ");
            int cantidad=Integer.parseInt(System.console().readLine());

            for(Productos a:Cliente){

                if(a.getProducto().equals(producto)){
                    a.setCantidad(a.getCantidad()+cantidad);
                    modificar=true;
                }

            }

            if(modificar==false){
                Cliente.add(new Productos(producto, cantidad));
            }
                

        }


        Ejercicio14.imprimir(lista, Cliente,descuento);


    }


}
