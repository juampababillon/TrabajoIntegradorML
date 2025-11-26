package main.java.org.example;

public class Main {
    public static void main(String[] args) {

        // Creamos un cliente
        Cliente cliente = new Cliente("Juan", "Pérez", 25);

        // Creamos productos
        Producto leche = new Producto("Leche", 1200, false);
        Producto yerba = new ProductoCooperativa("Yerba Cooperativa", 2000, false);
        Producto pan = new ProductoPrimeraNecesidad("Pan", 1800, false, 0.10); // 10% de descuento

        // Armamos los items del carrito
        ItemCarrito item1 = new ItemCarrito(leche, 2); // 2 leches
        ItemCarrito item2 = new ItemCarrito(yerba, 1); // 1 yerba coop
        ItemCarrito item3 = new ItemCarrito(pan, 3);   // 3 panes

        // Armamos el carrito
        Carrito carrito = new Carrito();
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);
        carrito.agregarItem(item3);

        // Mostramos los datos
        System.out.println("Cliente: " + cliente);
        System.out.println(carrito);
    }
}
