package main.java.org.example;

public class ProductoCooperativa extends Producto {

    private double descuento = 0.10; //es el 10% de descuento fijo

    public ProductoCooperativa(String nombre, double precio, boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
    }

    @Override
    public double precio() {
        return this.getPrecio() * (1 - descuento);
    }
}
