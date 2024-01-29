package Ejercicio17;

public class Elemento {
    private String nombre;
    private float precio;
    private int cantidad;


    public Elemento(String nombre, float precio, int cantidad){
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

    public float getPrecio() {
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

        resultado+=this.nombre+" PVP: "+this.precio+" Unidades: "+this.cantidad+" Subtotal: "+this.precio*this.cantidad;

        return super.toString();
    }



}
