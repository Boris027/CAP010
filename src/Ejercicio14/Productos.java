package Ejercicio14;

public class Productos {
    int cantidad;
    String producto;


    public Productos(String producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }


    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.producto+" "+this.cantidad;
    }
}
