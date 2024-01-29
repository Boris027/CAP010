package Ejercicio7;

public class Moneda {

    String posicion;
    int cantidad;

    public Moneda(int cantidad, String posicion){
        this.cantidad=cantidad;
        this.posicion=posicion;
    }

    public String convertir(){
        if(this.cantidad/100==1){
            return "1 euro";
        }else if(this.cantidad/100==2){
            return "2 euros";
        }else return this.cantidad +" centimos";
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        
        return convertir() +" "+this.posicion;
    }


}
