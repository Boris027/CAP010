package Ejercicio6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        HashMap<String,String> lista=new HashMap<String,String>();
        lista.put("Boris", "Contrasena");
        lista.put("Andrea", "Contrasena12");
        

        String usuario="";
        String contraseña="";
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<=2;i++){

            System.out.print("Introduce el usuario: ");
            usuario=sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            contraseña=sc.nextLine();



            if( lista.containsKey(usuario) && lista.get(usuario).equals(contraseña)){
                System.out.println("Bienvenido "+usuario);
                break;
            }else{
                System.out.println("“Lo siento, no tiene acceso al área restringida");
            }


        }

        

    }



}
