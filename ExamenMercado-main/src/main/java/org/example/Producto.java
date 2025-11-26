package main.java.org.example;

public class Producto {

    private String nombre;
    private double precio;
    private boolean esPrecioCuidado;

    public Producto(String nombre, double precio, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isPrecioCuidado() {
        return esPrecioCuidado;
    }

    public double precio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
