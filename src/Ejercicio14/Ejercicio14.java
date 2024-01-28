package Ejercicio14;
import java.util.ArrayList;
import java.util.HashMap;
public class Ejercicio14 {


    public static HashMap<String, Double> inicializar(){

        HashMap<String, Double> lista=new HashMap<String, Double>();

        lista.put("avena", 2.21);
        lista.put("garbanzos", 2.39);
        lista.put("tomate", 1.59);
        lista.put("jengibre", 3.13);
        lista.put("quinoa", 4.50);
        lista.put("guisantes", 1.60);

        return lista;
    }


    public static void imprimir(HashMap<String, Double> lista, ArrayList<Productos> Cliente,String codigo){

        float total=0;
        float descuento=0;
        System.out.printf("%s %s %s %s\n","Producto","Precio","Cantidad","Subtotal");
        System.out.println("----------------------------------");
        for(Productos a:Cliente){
            
            System.out.printf("%-8s %-9.2f %-7d %.2f\n",a.getProducto(),lista.get(a.getProducto()),a.getCantidad(),lista.get(a.getProducto())*a.getCantidad());
            
            total+=lista.get(a.getProducto())*a.getCantidad();
        }

        if(codigo.equals("ECODTO")){
            System.out.println("----------------------------------");
            descuento=total*10/100;
            System.out.printf("Descuento: %.2f\n",descuento);

        }

        System.out.println("----------------------------------");
        System.out.printf("Total: %.2f\n",total-descuento);

    }
    
    public static void main(String[] args) {
        
        HashMap<String,Double> lista=inicializar();

        ArrayList<Productos> Cliente=new ArrayList<Productos>();
        
        boolean salir=false;
        while(salir==false){
            System.out.print("Producto: ");
            String producto=System.console().readLine();
            if(producto.equals("fin")){
                break;
            }
            System.out.print("Cantidad: ");
            int cantidad=Integer.parseInt(System.console().readLine());

            Cliente.add(new Productos(producto, cantidad));

        }

        imprimir(lista, Cliente,"");



    }

}
