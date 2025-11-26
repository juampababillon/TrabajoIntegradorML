package main.java.org.example;

public class ItemCarrito {

    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double precio() {
        return producto.precio() * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.getNombre()+ " = $" + precio();
    }
}