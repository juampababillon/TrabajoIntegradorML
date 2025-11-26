package Test;

import org.example.Carrito;
import org.example.ItemCarrito;
import org.example.Producto;
import org.example.ProductoCooperativa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @Test
    void testPrecioCarrito() {
        Carrito c = new Carrito();

        Producto p1 = new Producto("Leche", 1000, false);
        Producto p2 = new ProductoCooperativa("Yerba", 2000, false);

        c.agregarItem(new ItemCarrito(p1, 2)); // 2000
        c.agregarItem(new ItemCarrito(p2, 1)); // 1800

        assertEquals(3800, c.precio());
    }
}
