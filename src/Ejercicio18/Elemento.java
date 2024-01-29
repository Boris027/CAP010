package Ejercicio18;

public class Elemento {
    private String nombre;
    private double precio;
    private int cantidad;


    public Elemento(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        
        String resultado="";
        String cantidad=String.format("%.2f",this.precio*this.cantidad );

        resultado+=this.nombre+" PVP: "+this.precio+" Unidades: "+this.cantidad+" Subtotal: "+cantidad;

        return resultado;
    }



}
