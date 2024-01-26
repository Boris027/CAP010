package Ejercicio1;
import java.util.ArrayList;
public class Ejercicio1{


    public static void main(String[] args) {
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Boris");
        nombres.add("Nacho");
        nombres.add("David");
        nombres.add("Fran");
        nombres.add("Eloy");
        nombres.add("Jorge");


        for(String a:nombres){
            System.out.println(a);
        }
    }
}