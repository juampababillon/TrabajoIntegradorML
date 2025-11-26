package main.java.org.example;

public class ProductoPrimeraNecesidad extends Producto {

    private double descuento; //porcentaje de descuento

    public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = descuento;
    }

    @Override
    public double precio() {
        // Precio con descuento aplicado
        return this.getPrecio() * (1 - descuento);
    }
}


