package Ejercicio8;

public class Palos {
    
    public static String getpalos(int numero){

        if(numero/2<5){
            return "oros";
        }else if(numero/2<10){
            return "copas";
        }else if(numero/2<15){
            return "espadas";
        }else if(numero/2<=20){
            return "bastos";
        }

        return "";
    }


    public static String getnumero(int numero){

        if(numero%10==8){
            return "sota";
        }else if (numero%10==9){
            return "caballo";
        }else if(numero%10==0){
            return "rey";
        }else if(numero%10==1){
            return "as";
        }else{
            return numero%10+"";
        }

        
    }

}
